public class interfaces {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.doNotEatMeat();
        b.eatMeat();
        b.omnivore();
    }
}

// Interface implements multiple inheritance.
interface Herbivore {
    void doNotEatMeat();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void doNotEatMeat() {
        System.out.println("Eats grass");
    }

    public void eatMeat() {
        System.out.println("Eats fish");
    }

    void omnivore() {
        System.out.println("Eats both fish and grass");
    }
}
