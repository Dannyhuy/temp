class Employee{
    private int id, salary;
    private String firstName, lastName;
    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return lastName + " " + firstName;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int rasiseSalary(int percent){
        this.salary = this.salary + (this.salary*percent/100);
        return this.salary;
    }
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + ", salary=" + salary
                + "]";
    }
    
}

public class file6 {
    public static void main(String[] args) {
            // Test constructor and toString()
      Employee e1 = new Employee(8, 2500, "Peter", "Tan");
      System.out.println(e1);  // toString();

      // Test Setters and Getters
      e1.setSalary(999);
      System.out.println(e1);  // toString();
      System.out.println("id is: " + e1.getId());
      System.out.println("firstname is: " + e1.getFirstName());
      System.out.println("lastname is: " + e1.getLastName());
      System.out.println("salary is: " + e1.getSalary());

      System.out.println("name is: " + e1.getName());
      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

      // Test raiseSalary()
      System.out.println(e1.rasiseSalary(10));
      System.out.println(e1);
    }
}
//test