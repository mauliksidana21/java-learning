class employee{
    String name;
    int id;
    float salary;
    employee(){
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);

    }
}
public class defaultco {

    public static void main(String[] args) {
        employee e1 = new employee();
        
          e1.display();
    }
}