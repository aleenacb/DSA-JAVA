public class Continuelabel {
    public static void main(String[] args) {
        //first label
        first:
        for (int i = 0; i < 3; i++) {
            //second label
            second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue first;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
