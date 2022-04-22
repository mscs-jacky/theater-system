package TheaterSystem.Models;
import java.time.LocalDateTime; // import the LocalDateTime class
import java.util.ArrayList;

public class ShowTime {

    private LocalDateTime startTime;

    private Theater theater;

    private ArrayList<Customer> Attendees;


    public ShowTime(LocalDateTime startTime, Theater theater){
        this.startTime = startTime;
        this.theater = theater;
    }

    public LocalDateTime getStartTime(){
        return this.startTime;
    }

    public void setStartTime(LocalDateTime startTime){
        this.startTime = startTime;
        this.notifyCustomer();
    }

    public void attach(Customer customer){
        Attendees.add(customer);
    }

    public void detach(Customer customer){
        Attendees.remove(customer);
    }

    public void notifyCustomer(){
        for(Customer Attendee : Attendees){
            Attendee.Update(this);
        }
    }


    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}
