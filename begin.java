/* CLASSES AND OBJECTS IN JAVA  */

class car{
    String name,color,model;
    void start(){
        System.out.println("Car has started.");
        

    }
    void stop(){
        System.out.println("Car has stopped.");
    }
    
}

public class begin{
    public static void main(String []args){
        car c1 = new car();
        c1.name = "BMW";
        c1.color = "Black";
        c1.model = "2023";
        System.out.println("Car name is : "+c1.name);
        System.out.println("Car color is : "+c1.color);
        System.out.println("Car model is : "+c1.model);
    }
}