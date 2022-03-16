package TheaterSystem.Models.Tickets;

import TheaterSystem.Models.Movie;
import TheaterSystem.Models.ShowTime;
import TheaterSystem.Models.Theater;
import TheaterSystem.Models.Ticket;

import java.util.Calendar;

public class General extends Ticket {

    private static final double tuesdayDiscount = .1;


    public General(Movie movie, double price, ShowTime showTime, Theater theater) {
        setMovie(movie);
        setShowTime(showTime);
        setTheater(theater);
        if(checkIfTuesday()){
            setPrice(price - (price * tuesdayDiscount));
        }
        else{
            setPrice(price);

        }

    }

    @Override
    public void getTicketDetails() {
        System.out.println("Movie:          " + getMovie());
        System.out.println("Ticket Type: General");
        System.out.println("ShowTime:   " + getShowTime().getStartTime());
        System.out.println("Price:      " + getPrice());
        System.out.println("Theater:  " + getTheater().getTheaterName());
}

    @Override
    public String getTicketType() {
        return "general";
    }

    private boolean checkIfTuesday(){
        Calendar myDate = Calendar.getInstance(); // set this up however you need it.
        int dow = myDate.get (Calendar.DAY_OF_WEEK);
        return dow == Calendar.TUESDAY;
    }

}
