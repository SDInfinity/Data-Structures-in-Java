public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse("Mammal");
        System.out.println(h.type);
        h.eat();
        h.walk();
    }
}

abstract class Animal {
    String type;

    Animal() {
        type = "Fish";
    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(String type) {
        this.type = type;
    }

    void walk() { // implementation of abstract function walk
        System.out.println("Walks on 4 legs");
    }
}
