public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Cruzz";
        System.out.println(s1.name + " studies in " + Student.school + ".");
        System.out.println("Average for " + s1.name + " is : " + Student.average(100, 90, 80) + ".");
        Student s2 = new Student();
        s2.name = "Ravi";
        System.out.println(s2.name + " studies in " + Student.school + ".");
        System.out.println("Average for " + s2.name + " is : " + Student.average(90, 92, 100) + ".");
    }
}

// Static keywords is used to define those variables and functions that will be
// shared by all the instances of the same class.
class Student {
    String name;
    static String school = "Central Park";
    int age;

    static int average(int math, int chem, int phy) {
        return (math + chem + phy) / 3;
    }
}
