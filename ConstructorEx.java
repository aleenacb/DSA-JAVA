package OOPS;
//A constructor is used to initialize an object
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        Student s1 = new Student("Aleena" , 22);
        System.out.println(" My name is " + s1.name + ", I'm " + s1.age + " years old");
    }
}