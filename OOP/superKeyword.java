public class superKeyword {
    public static void main(String [] args){
        Dog tom =new Dog();;
        tom.breed="Husky";
        System.out.println(tom.breed);
        
    }
}
//Super keyword refers to the immediate parent class.
class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog Constructor");
    }
    String breed;
}
