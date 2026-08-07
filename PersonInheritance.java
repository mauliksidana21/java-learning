class person {
    int age ;
    String name;
    
}
class teacher extends person {
    String subject;
    int salary;
    void display() {
        System.out.println("Name of teacher is: " + name);
        System.out.println("Age of teacher is: " + age);
        System.out.println("Subject of teacher is: " + subject);
        System.out.println("Salary of teacher is: " + salary);
    }

}
public class PersonInheritance{
    public static void main(String[] args) {
        teacher t=new teacher();
        t.name="sourav";
        t.age = 30;
        t.subject = "Mathematics";
        t.salary = 50000;
        System.out.println("TEACHER DETAILS !!");
        t.display();
    }

}
