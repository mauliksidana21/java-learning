 
class Movie {
    String movieName;
    String hero;
    String director;
    double rating;

    Movie(String m, String h, String d, double r) {
        movieName = m;
        hero = h;
        director = d;
        rating = r;
    }

    void display() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Hero       : " + hero);
        System.out.println("Director   : " + director);
        System.out.println("Rating     : " + rating);
        System.out.println();
    }
}



public class input {
     public static void main(String[] args) {

        Movie m1 = new Movie("Leo", "Vijay", "Lokesh", 4.5);
        Movie m2 = new Movie("Avengers Endgame", "Robert Downey Jr.", "Russo Brothers", 4.9);
        Movie m3 = new Movie("Interstellar", "Matthew McConaughey", "Christopher Nolan", 4.8);

        m1.display();
        m2.display();
        m3.display();
    }

}
