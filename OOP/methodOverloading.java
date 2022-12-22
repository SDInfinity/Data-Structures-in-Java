public class methodOverloading {
    public static void main(String[] args) {
        Calculator sum = new Calculator();
        System.out.println(sum.sum(1, 2));
        System.out.println(sum.sum(1.2f, 1.5f));
        System.out.println(sum.sum(1, 2, 3));
    }
}

// compile time polymorphism
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
