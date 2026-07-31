/**
 * default
 */
 class student {
    int id;
    String name;
    int marks;

    student(){
        System.out.println("Default constructor");
    }
    void display(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

    }

}

public class defaultConstructor {
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }    
    }
