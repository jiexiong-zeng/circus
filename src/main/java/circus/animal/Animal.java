package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {

<<<<<<< HEAD
    public String speak() {
        return "I am an animal";
    }

    @Override
    public int getValue() {
        return 0;
    }
=======
    public String name;
    public abstract String speak();
>>>>>>> upstream/master
}
