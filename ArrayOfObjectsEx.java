package OOPS;

class StudentEx{
    public int roll_no;
    public String name;
    StudentEx(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class ArrayOfObjectsEx {
    public static void main(String[] args) {
        StudentEx[] arr;
        arr = new StudentEx[5];
        arr[0] = new StudentEx(1, "Aleena");
        arr[1] = new StudentEx(2, "Alisha");
        arr[2] = new StudentEx(3, "Anagha");
        arr[3] = new StudentEx(4, "Alvya");
        arr[4] = new StudentEx(5, "Ann");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : {" + arr[i].roll_no + " " + arr[i].name+ " }");
        }
    }
}
