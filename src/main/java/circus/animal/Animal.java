package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {

    public String speak() {
        return "I am an animal";
    }

    @Override
    public int getValue() {
        return 0;
    }
}
