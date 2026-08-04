class rectangle{
    int length,breadth;
    rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    void display(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(length*breadth);
    }
}




public class parametrise {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(10,20);
        r1.display();
    }
}
