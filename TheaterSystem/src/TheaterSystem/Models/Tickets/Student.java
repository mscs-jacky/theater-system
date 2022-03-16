package TheaterSystem.Models.Tickets;

import TheaterSystem.Models.Movie;
import TheaterSystem.Models.ShowTime;
import TheaterSystem.Models.Theater;
import TheaterSystem.Models.Ticket;

public class Student extends Ticket {

    private static final double studentDiscount = .15;



    public Student(Movie movie, double price, ShowTime showTime, Theater theater) {
        setMovie(movie);
        setShowTime(showTime);
        setTheater(theater);
        if(verifyStudentStatus()){
            setPrice(price - (price * studentDiscount));
        }
        else{
            setPrice(price);
        }

    }

    @Override
    public void getTicketDetails() {
        System.out.println("Movie:          " + getMovie());
        System.out.println("Ticket Type: Student");
        System.out.println("ShowTime:   " + getShowTime().getStartTime());
        System.out.println("Price:      " + getPrice());
        System.out.println("Theater:  " + getTheater().getTheaterName());
}

    @Override
    public String getTicketType() {
        return "student";
    }

    private boolean verifyStudentStatus(){
        return true;
    }

}
