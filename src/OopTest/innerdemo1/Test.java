package OopTest.innerdemo1;

public class Test {
    public static void main(String[] args) {

        Swim s = new Swim() {

            @Override
            public void swim() {

            }
        };
        goswimming(s);
    }

    public static void goswimming(Swim s) {
        s.swim();

    }
}

