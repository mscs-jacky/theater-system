package TheaterSystem.Models.Tickets;

import TheaterSystem.Models.Movie;
import TheaterSystem.Models.ShowTime;
import TheaterSystem.Models.Theater;
import TheaterSystem.Models.Ticket;

import java.util.Calendar;

public class Senior extends Ticket {

    private static double seniorDiscount = .2;



    public Senior(Movie movie, double price, ShowTime showTime, Theater theater) {
        setMoive(movie);
        setShowTime(showTime);
        setTheater(theater);
        if(verifySeniorStatus() == true){
            setPrice(price - (price * seniorDiscount));
        }
        else{
            setPrice(price );
        }

    }

    @Override
    public void getTicketDetails() {
        System.out.println("Movie:          " + getMoive());
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
