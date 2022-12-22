public class arithmeticOperators {
    public static void main(String [] args)
    { 
        //Binary Artithmetic Operators
        int a=3;
        int b=3;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulo: "+(a%b));

        //Unary Arithmetic Operators
        int c=10;
        int d=++c;
        System.out.println(c);
        System.out.println(d);
        int e=10;
        int f=e++;
        System.out.println(e);
        System.out.println(f);
        int g=10;
        int h=--g;
        System.out.println(g);
        System.out.println(h);
        int i=10;
        int j=i--;
        System.out.println(i);
        System.out.println(j);
    }
    
}
