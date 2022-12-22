public class hybridInheritance {
    public static void main(String[] args) {
        Dog hunter = new Dog("Husky");
        hunter.eat();
        hunter.walks();
        Tuna bluefin = new Tuna("Bluefin");
        bluefin.eat();
        bluefin.swims();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats.");
    }
}

class Mammal extends Animal {
    void walks() {
        System.out.println("Walks.");
    }
}

class Dog extends Mammal {
    String breed;

    Dog(String breed) {
        this.breed = breed;
    }
}

class Fish extends Animal {
    void swims() {
        System.out.println("Swims.");
    }
}

class Tuna extends Fish {
    String name;

    Tuna(String name) {
        this.name = name;
    }
}
