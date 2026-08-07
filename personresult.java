class person{
    String name;

}
class student extends person{
    int rollno = 128;
   
}
class result extends student{
    int marks = 90;
    void display() {
        System.out.println("Name of student is: " + name);
        System.out.println("Roll number of student is: " + rollno);
        System.out.println("marks of student is: " + marks);

}
}


public class personresult {
    public static void main(String[] args) {
        result r = new result();
        r.name = "sourav";
        r.display();
    }
}
