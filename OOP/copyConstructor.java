public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sougata", 20);
        s1.password = "abc";
        s1.marks1[0] = 100;
        s1.marks1[1] = 90;
        s1.marks1[2] = 80;
        s1.marks2[0] = 100;
        s1.marks2[1] = 90;
        s1.marks2[2] = 80;
        // creating object s2
        Student s2 = new Student(s1);
        s2.password = "xyz";
        // now let's update marks1 of s1
        s1.marks1[2] = 100;
        for (int i = 0; i < s2.marks1.length; i++) {
            System.out.print(s2.marks1[i] + " "); // change made in marks1 gets reflected
        }
        System.out.println(" ");
        // let's update marks2 of s1
        s1.marks2[2] = 100;
        for (int i = 0; i < s2.marks2.length; i++) {
            System.out.print(s2.marks2[i] + " "); // change made in marks2 does not get reflected
        }
        System.out.println(" ");
        System.out.println(s2.name + " " + s2.age + " " + s2.password);
    }
}

class Student {
    String name, password;
    int age, marks1[], marks2[];

    // Copy Constructor
    Student(Student s1) // Values that the other objects get initialised with when they are created
                        // serving as a copy of s1.
    {
        this.name = s1.name;
        this.age = s1.age;
        marks1 = new int[3];
        marks2 = new int[3];
        this.marks1 = s1.marks1; // Shallow Copy i.e copy of reference of array marks1.(change gets reflected)
        for (int i = 0; i < marks2.length; i++) {
            this.marks2[i] = s1.marks2[i]; // Deep Copy i.e creating a new array altogether.(change doesn't get
                                           // reflected)
        }
    }

    Student(String name, int age) // to initialse object s1
    {
        marks1 = new int[3]; // to ensure the length of the array when object gets created
        marks2 = new int[3];
        this.name = name;
        this.age = age;
    }

}
