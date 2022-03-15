package TheaterSystem.Models.Tickets;

import TheaterSystem.Models.Movie;
import TheaterSystem.Models.ShowTime;
import TheaterSystem.Models.Theater;
import TheaterSystem.Models.Ticket;

public class Matinee extends Ticket {

    private static double surgeCharge = 9.99;



    public Matinee(Movie movie, double price, ShowTime showTime, Theater theater) {
        setMoive(movie);
        setShowTime(showTime);
        setTheater(theater);
        setPrice(price + surgeCharge);


    }

    @Override
    public void getTicketDetails() {
        System.out.println("Movie:          " + getMoive());
        System.out.println("Ticket Type: Matinee");
        System.out.println("ShowTime:   " + getShowTime().getStartTime());
        System.out.println("Price:      " + getPrice());
        System.out.println("Theater:  " + getTheater().getTheaterName());
}

    @Override
    public String getTicketType() {
        return "matinee";
    }


}
