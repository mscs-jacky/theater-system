package TheaterSystem.Models.Tickets;

import TheaterSystem.Models.Movie;
import TheaterSystem.Models.ShowTime;
import TheaterSystem.Models.Theater;
import TheaterSystem.Models.Ticket;

public class Senior extends Ticket {

    private static final double seniorDiscount = .2;



    public Senior(Movie movie, double price, ShowTime showTime, Theater theater) {
        setMovie(movie);
        setShowTime(showTime);
        setTheater(theater);
        if(verifySeniorStatus()){
            setPrice(price - (price * seniorDiscount));
        }
        else{
            setPrice(price );
        }

    }

    @Override
    public void getTicketDetails() {
        System.out.println("Movie:          " + getMovie());
        System.out.println("Ticket Type: Senior");
        System.out.println("ShowTime:   " + getShowTime().getStartTime());
        System.out.println("Price:      " + getPrice());
        System.out.println("Theater:  " + getTheater().getTheaterName());
}

    @Override
    public String getTicketType() {
        return "senior";
    }

    private boolean verifySeniorStatus(){
        return true;
    }

}
