class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}
 class dog extends Animal {
 void bark(){
    System.out.println("DOG BARKS !!");
 }
}
 class horse extends Animal {
 void riding(){
    System.out.println("HORSE RIDING IS A NICE SPORT!");
 }
}
public class animalinheritance{
    public static void main(String[] args) {
    dog d = new dog();
    System.out.println("dog is a child class of animal ");
    d.eat();
    d.bark();

    horse h = new horse();
    System.out.println("horse is a child class of animal ");
    h.eat();
    h.riding();
    }

}
