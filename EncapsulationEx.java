package OOPS;
//Encapsulation means wrapping data and methods together and controlling access to the data
class StudentClass {
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
public class EncapsulationEx {
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass();
        s1.setAge(22);
        System.out.println(s1.getAge());
    }
}
