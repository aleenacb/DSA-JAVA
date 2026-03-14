public class Nested {
    public static void main(String[] args) {
        int i = 10;
        if (i == 10 || i < 15) {
            if (i < 15) 
            System.out.println("i is lesser than 15");
            if (i < 12) 
            System.out.println("i is lesser than 12");
        }
        else {
            System.out.println("i is greater than 15");
        }
    }
}