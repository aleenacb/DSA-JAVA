import java.util.ArrayList;
/*import java.util.List;
class WrapperClass {
    public static void main(String[] args) {
        char c = 'A';
        //unboxing-> char to Character
        Character ch = c;
        ArrayList<Integer> list = new ArrayList<>();
        //Autoboxing int -> Integer
        list.add(25);
        System.out.println(list.get(0));
    }
}*/


//unboxing
class WrapperClass {
    public static void main(String[] args) {
        Character c ='A';
        //unboxing: Character -> char
        char ch = c;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        int num = list.get(0);
        System.out.println(num);
    }
}