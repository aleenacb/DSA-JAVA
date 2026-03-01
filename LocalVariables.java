class LocalVariables {
    public static void main(String[] args) {
        int x = 10;
        String msg = "Aleena";
        System.out.println("X = " + x);
        System.out.println("Message : " + msg);
        if (x < 5) {
            String res = "X is lesser than 5";
            System.out.println(res);
        }
        for (int i = 0; i < 3; i++) {
            String loop = "iteration " + i;
            System.out.println(loop);
        }
    }
}