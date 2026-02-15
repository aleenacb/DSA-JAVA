public class Encapsulation {
    private int id;
    private String name;
    //Setter method
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    //Getter method
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Encapsulation emp = new Encapsulation();
        emp.setId(101);
        emp.setName("Aleena");
        System.out.println("Employee id : " + emp.getId());
        System.out.println("Employee name : " + emp.getName());
    }
}