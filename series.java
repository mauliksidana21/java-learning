class input {
    String seriesName;
    String genre;
    int numberOfSeasons;
    String ottPlatform;

    input(String n, String g, int s, String o) {
        seriesName = n;
        genre = g;
        numberOfSeasons = s;
        ottPlatform = o;
    }
    void display() {
        System.out.println("Series Name : " + seriesName);
        System.out.println("Genre       : " + genre);
        System.out.println("Seasons     : " + numberOfSeasons);
        System.out.println("OTT         : " + ottPlatform);
        System.out.println();
    }
}
public class series{
    public static void main(String[] args) {


        input s1 = new input("Stranger Things", "Sci-Fi", 4, "Netflix");
        input s2 = new input("Wednesday", "Horror", 1, "Netflix");
        input s3 = new input("Money Heist", "Crime", 5, "Netflix");

        s1.display();
        s2.display();
        s3.display();   
        
    }
}

