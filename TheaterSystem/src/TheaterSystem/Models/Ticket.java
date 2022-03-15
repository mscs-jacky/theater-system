package TheaterSystem.Models;


public abstract class Ticket {

    private Movie movie;
    private ShowTime showTime;
    private Theater theater;
    private int id;
    private double price;

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Theater getTheater() {
        return theater;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void getTicketDetails() {
        System.out.println("Movie:         " + movie.getMovieName());
        System.out.println("Theater:  " + theater.getTheaterName());
        System.out.println("Price:     " + price);
        System.out.println("Showtime:    " + showTime.getStartTime());
    }

    public String getTicketType() {
        return null;
    }

}