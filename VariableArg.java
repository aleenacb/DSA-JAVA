class VariableArg {
    public static void Names(String...n){
        for(String i : n) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Names("Aleena","Geeks");
    }
}