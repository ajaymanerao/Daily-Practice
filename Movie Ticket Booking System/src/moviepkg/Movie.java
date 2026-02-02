package moviepkg;

public class Movie {

    private int movieId;
    private String title;
    private String genre;
    private double ticketPrice;
    private static final double DISCOUNT = 10.0;

    public Movie(int movieId, String title, String genre, double ticketPrice) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    public double getDiscountedPrice() {
        return ticketPrice - (ticketPrice * DISCOUNT / 100);
    }

    public void displayMovieDetails() {
        System.out.println("Movie ID     : " + movieId);
        System.out.println("Title        : " + title);
        System.out.println("Genre        : " + genre);
        System.out.println("Ticket Price : " + ticketPrice);
        System.out.println("Discount     : " + DISCOUNT + "%");
    }
}
