import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int UNIT_SIZE = 20;
    private static final int GAME_SPEED = 150;

    private int[] snakeX = new int[300];
    private int[] snakeY = new int[300];
    private int snakeLength = 3;
    private String direction = "R"; // R: right, L: left, U: up, D: down
    private boolean isStarted = false;
    private boolean isFailed = false;

    private int foodX, foodY;
    private Random random = new Random();

    private Timer timer;

    public SnakeGame() {
        this.setBounds(0, 0, WIDTH, HEIGHT);
        this.setBackground(Color.WHITE);
        this.setFocusable(true);
        this.addKeyListener(this);

        initSnake();
        generateFood();

        timer = new Timer(GAME_SPEED, this);
        timer.start();
    }

    private void initSnake() {
        snakeX[0] = 100;
        snakeY[0] = 100;
        snakeX[1] = 80;
        snakeY[1] = 100;
        snakeX[2] = 60;
        snakeY[2] = 100;
    }

    private void generateFood() {
        foodX = (random.nextInt(38) + 1) * UNIT_SIZE;
        foodY = (random.nextInt(28) + 1) * UNIT_SIZE;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw welcome text
        if (!isStarted) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.drawString("Press Space to Start", WIDTH / 2 - 120, HEIGHT / 2);
        }

        // Draw snake
        g.setColor(Color.GREEN);
        for (int i = 0; i < snakeLength; i++) {
            g.fillRect(snakeX[i], snakeY[i], UNIT_SIZE - 2, UNIT_SIZE - 2);
        }

        // Draw food
        g.setColor(Color.RED);
        g.fillOval(foodX, foodY, UNIT_SIZE, UNIT_SIZE);

        // Draw score
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Score: " + (snakeLength - 3), 10, 20);

        // Draw game over text
        if (isFailed) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over! Press Space to Restart", WIDTH / 2 - 200, HEIGHT / 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStarted && !isFailed) {
            move();
            checkCollision();
            checkEatFood();
        }
        repaint();
    }

    private void move() {
        for (int i = snakeLength - 1; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }

        switch (direction) {
            case "R":
                snakeX[0] += UNIT_SIZE;
                break;
            case "L":
                snakeX[0] -= UNIT_SIZE;
                break;
            case "U":
                snakeY[0] -= UNIT_SIZE;
                break;
            case "D":
                snakeY[0] += UNIT_SIZE;
                break;
        }
    }

    private void checkCollision() {
        // Check wall collision
        if (snakeX[0] < 0 || snakeX[0] >= WIDTH || snakeY[0] < 0 || snakeY[0] >= HEIGHT) {
            isFailed = true;
        }

        // Check self collision
        for (int i = 1; i < snakeLength; i++) {
            if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                isFailed = true;
                break;
            }
        }
    }

    private void checkEatFood() {
        if (snakeX[0] == foodX && snakeY[0] == foodY) {
            snakeLength++;
            generateFood();
        }
    }

    private void resetGame() {
        snakeLength = 3;
        initSnake();
        direction = "R";
        isStarted = true;
        isFailed = false;
        generateFood();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_SPACE) {
            if (!isStarted || isFailed) {
                resetGame();
            }
            return;
        }

        if (!isStarted || isFailed) return;

        switch (keyCode) {
            case KeyEvent.VK_UP:
                if (!direction.equals("D")) direction = "U";
                break;
            case KeyEvent.VK_DOWN:
                if (!direction.equals("U")) direction = "D";
                break;
            case KeyEvent.VK_LEFT:
                if (!direction.equals("R")) direction = "L";
                break;
            case KeyEvent.VK_RIGHT:
                if (!direction.equals("L")) direction = "R";
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(WIDTH, HEIGHT);

        SnakeGame game = new SnakeGame();
        frame.add(game);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
