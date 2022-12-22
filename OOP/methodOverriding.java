public class methodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

// run time polymorphism
class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}