public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.title = "Spider-Man: Homecoming";
        movie1.genre = "Action, Adventure, Science Fiction";
        movie1.duration = 133;

        Movie movie2 = new Movie();
        movie2.title = "The Incredibles 2";
        movie2.genre = "Animation, Action, Comedy";
        movie2.duration = 118;

        Movie movie3 = new Movie();
        movie3.title = "Jurassic World";
        movie3.genre = "Action, Adventure, Science Fiction";
        movie3.duration = 124;

        System.out.println("Movie 1");
        System.out.println("Title: " + movie1.title);
        System.out.println("Genre: " + movie1.genre);
        System.out.println("Duration: " + movie1.duration + " minutes");

        System.out.println();

        System.out.println("Movie 2");
        System.out.println("Title: " + movie2.title);
        System.out.println("Genre: " + movie2.genre);
        System.out.println("Duration: " + movie2.duration + " minutes");

        System.out.println();

        System.out.println("Movie 3");
        System.out.println("Title: " + movie3.title);
        System.out.println("Genre: " + movie3.genre);
        System.out.println("Duration: " + movie3.duration + " minutes");
    }
}