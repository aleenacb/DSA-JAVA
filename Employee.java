public class Employee{
    //Instance variables
    private String name;
    private float salary;
    //Constructor
    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    //getters method
    public String getName() {
        return name;
    }
    public float getSalary() {
        return salary;
    }
    //Setters method
    public void setName() {
        this.name = name;
    }
    public void setSalary() {
        this.salary = salary;
    }
    //Display method
    public void Display() {
        System.out.println("Employee : " + name);
        System.out.println("Salary : " + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Aleena", 5000000.0f);
        emp.Display();
    }
}