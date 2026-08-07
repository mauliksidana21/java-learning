interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class PrinterMachine implements Printable, Scannable {

    public void print() {
        System.out.println("Printing the document...");
    }

    public void scan() {
        System.out.println("Scanning the document...");
    }
}

public class PrinterDemo {
    public static void main(String[] args) {

        PrinterMachine p = new PrinterMachine();

        p.print();
        p.scan();
    }
}