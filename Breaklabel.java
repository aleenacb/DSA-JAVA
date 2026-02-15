public class Breaklabel {
    public static void main(String [] args) {
        //first label
        first:
        for (int i = 0; i < 3; i++) {
            //Second label
            second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break first;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
