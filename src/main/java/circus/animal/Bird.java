package circus.animal;

public class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    @Override
    public int getValue() {
        return 20;
    }
}
