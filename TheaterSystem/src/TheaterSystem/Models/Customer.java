package TheaterSystem.Models;

import java.time.LocalDateTime;

public class Customer extends Person{

    private LocalDateTime showtime;


    public Customer(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void Update(ShowTime showTime){
        this.showtime = showTime.getStartTime();
    }
}
