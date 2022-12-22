
public class inheritance {
    public static void main(String[] args) {
        Tuna t = new Tuna("Fish");
        System.out.println(t.type + " ");
        t.eat();
        t.swim();
    }
}
//single-level inheritance
class Animal { // Parent class
    String type;
    
    void eat() {
        System.out.println("Eats.");
    }
}

class Tuna extends Animal { // will hace all the properties and methods of class Animal, this is child
                            // class.
    Tuna(String type) {
        this.type = type;
    }

    void swim() {
        System.out.println("Swims in water.");
    }
}