class book {
    String title;
    String author;
    int id;

    book(String t, String a, int i) {
        title = t;
        author = a;
        id = i;
    }

    book(book b) {
        title = b.title;
        author = b.author;
        id = b.id;

    }
    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(id);
    }
}

public class copyconstructor {
    public static void main(String[] args) {
        book b1 = new book("harry potter", "jk rowling ", 123);
        book b2 = new book(b1);
        System.out.println("original ");
        b1.display();
        
        System.out.println("duplicate ");
        b2.display();

    }
}
