package OOPS;
class VariableArgumentsEx {
    public static void names(String... n) {
        //Iterate through array and print each name
        for(String i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        names("Aleena", "Chediyath","Benoy");
        names("Kerala", "Pathnamthitta");
    }
}
