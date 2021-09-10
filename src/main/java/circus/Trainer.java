package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

<<<<<<< HEAD:src/main/java/circus/Trainer.java
        train(new Duck());
        //train(new circus.Parrot());
        Parrot p1 = (Parrot)b;
        p1.speak();


        Animal a2 = new Animal() {

        };
        Bird b2 = new Bird();

=======
        train(new Duck("Daisy"));
        // train(new animal.Parrot());
>>>>>>> upstream/master:src/main/java/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
<<<<<<< HEAD:src/main/java/circus/Trainer.java
        Duck d = (Duck) bird;
        //d.speak();
        d.swim();
=======
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
>>>>>>> upstream/master:src/main/java/Trainer.java
    }
}
