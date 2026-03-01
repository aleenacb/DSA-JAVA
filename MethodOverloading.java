class MethodOverloading {
    public static void print(String message) {
        System.out.println(message);
    }
    public static void print(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.print("Hello! ALeena");
        obj.print("Welcome to Java", 3);
    }
}