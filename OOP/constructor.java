public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sougata", 18);
        System.out.println(s1.name + " " + s1.age);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
