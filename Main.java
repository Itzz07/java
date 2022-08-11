import java.util.Locale;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        /**************************************************************************************************************
         * Question: From which class are each of the invoked addBonus() methods below executed and why?              *
         * Answer: the addBonus() methods are invoked from their respective subclasses i.e Manager and Clerk because  *
         * the addBonus() method from the Employee class has been overridden in each of those subclasses.             *                                                                                       *
         *************************************************************************************************************/

        Employee manager1 = new Manager("MN111", "James Banda", "HR", 25000);
        Employee manager2 = new Manager("MN112", "Jane Chalwe", "R&D", 25000);
        Employee clerk1 = new Clerk("E056", "Moses Phiri", "Accounts", 10000);
        Employee clerk2 = new Clerk("E089", "Diana Muya", "Accounts", 10000);

        manager1.display();
        System.out.println();
        manager1.display("ID");

        System.out.println("Salary after adding bonus for " + manager1.getName() + ": " + manager1.addBonus());

        manager2.display();
        System.out.println();
        manager2.display("Name");

        System.out.println("Salary after adding bonus for " + manager2.getName() + ": " + manager2.addBonus());

        System.out.println();

        clerk1.display();
        System.out.println();
        clerk1.display("Designation");

        System.out.println("Salary after adding bonus for " + clerk1.getName() + ": " + clerk1.addBonus());

        System.out.println(); 

        clerk2.display();
        System.out.println();
        clerk1.display("Salary");

        System.out.println("Salary after adding bonus for " + clerk2.getName() + ": " + clerk2.addBonus());

        System.out.println();

        System.out.println("Is " + manager1.getName() + " the same as " + manager2.getName() + "? " + manager1.equals(manager2));

        System.out.println("Is " + clerk1.getName() + " the same as " + clerk2.getName() + "? " + clerk1.equals(clerk2));
    }
}
class Employee {
    protected String employeeID;
    protected String name;
    protected String designation;
    protected double salary;

    public Employee() {

    }

    public Employee(String employeeID, String name, String designation, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(Employee employee) {
        this.employeeID = employee.getEmployeeID();
        this.name = employee.getEmployeeID();
        this.designation = employee.getDesignation();
        this.salary = employee.salary;
    }



    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double addBonus() {
        return this.salary + 800;
    }

    /**
     * This method displays an employee's information in the form:
     * Name: James Phiri
     * ID: H280
     * Designation: Manager
     * Salary: K200
     * It relies on the toString() method
     */
    public void display() {
        System.out.println(this.toString());
    }
    public void display(String field) {
        field = field.toLowerCase();
        switch (field) {
            case "name": System.out.println("Employee Name: " + getName()); break;
            case "designation": System.out.println("Employee Designation: " + getDesignation()); break;
            case "id": System.out.println("Employee ID: " + getEmployeeID()); break;
            case "salary": System.out.println("Employee Salary: " + getSalary()); break;
            default: System.out.println("There was an error processing your request. The attribute you defined does not exist");
        }
    }

    @Override
    public boolean equals(Object otherEmployee) {
        if (otherEmployee == null)
            return false;
        if(!(otherEmployee instanceof Employee))
            return false;
        if(!getDesignation().equals(((Employee)otherEmployee).getDesignation()))
            return false;
        if(!getEmployeeID().equals(((Employee)otherEmployee).getEmployeeID()))
            return false;
        if(!getName().equals(((Employee)otherEmployee).getName()))
            return false;
        return true;

    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "ID: " + employeeID + "\n" +
                "Designation: " + designation + "\n" +
                "Salary: K" + salary + "\n";
    }

}

class Manager extends Employee {
    public Manager() {
        super();
    }

    public Manager(String employeeID, String name, String designation, double salary) {
        super(employeeID, name, "Manager", salary);
        this.designation = designation;
    }

    public Manager(Employee employee) {
        super(employee);
    }

    @Override
    public double addBonus() {
        return this.salary + 1000;
    }
}

class Clerk extends Employee {
    public Clerk() {
        super();
    }

    public Clerk(String employeeID, String name, String designation, double salary) {
        super(employeeID, name, "Clerk", salary);
        this.designation = designation;
    }

    public Clerk(Employee employee) {
        super(employee);
    }

    @Override
    public double addBonus() {
        return this.salary + 600;
    }
}
