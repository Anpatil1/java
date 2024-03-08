package classComponents.blocks;

public class Movie {
    int movieId;
    String movieName;

    static {
        System.out.println("Movie class loaded in the memory: static block");
    }

    {
        System.out.println("Movie : instance block");
    }

    public Movie(int movieId, String movieName) {
        this();
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public Movie() {
        //1. constructor call
        //2. instance block
        System.out.println("Movie zero param");
    }

    public static void main(String[] args) {
        Movie movie = new Movie(1, "Dabaang");
    }
}