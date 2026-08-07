public class EmployeeDetails {
    public static void main(String[] args) {

        Manager m = new Manager();
        System.out.println("Manager Details");
        m.display();

        System.out.println();

        Developer d = new Developer();
        System.out.println("Developer Details");
        d.display();

        System.out.println();

        Clerk c = new Clerk();
        System.out.println("Clerk Details");
        c.display();
    }
}

class Employee {
    String company = "ABC Technologies";
}

class Manager extends Employee {
    String designation = "Manager";
    int salary = 80000;

    void display() {
        System.out.println("Company: " + company);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    String designation = "Developer";
    int salary = 60000;

    void display() {
        System.out.println("Company: " + company);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Clerk extends Employee {
    String designation = "Clerk";
    int salary = 30000;

    void display() {
        System.out.println("Company: " + company);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}