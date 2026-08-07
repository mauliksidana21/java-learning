class Student {
    int rollno = 101;
    String name = "Maulik";
}

class Marks extends Student {

    int p = 90;
    int c = 20;
    int m = 80;

    int total;
    int average;

    Marks() {
        total = p + c + m;
        average = total / 3;
    }

    void display() {
        System.out.println("ROLL NUMBER -> " + rollno);
        System.out.println("NAME -> " + name);
        System.out.println("MARKS in Physics -> " + p);
        System.out.println("MARKS in Chemistry -> " + c);
        System.out.println("MARKS in Mathematics -> " + m);
        System.out.println("TOTAL -> " + total);
        System.out.println("AVERAGE -> " + average);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Marks obj = new Marks();
        obj.display();
    }
}