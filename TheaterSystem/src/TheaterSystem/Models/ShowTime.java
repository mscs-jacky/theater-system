package TheaterSystem.Models;
import java.time.LocalDateTime; // import the LocalDateTime class

public class ShowTime {

    private LocalDateTime startTime;

    private Theater theater;

    public ShowTime(LocalDateTime startTime, Theater theater){
        this.startTime = startTime;
        this.theater = theater;
    }

    public LocalDateTime getStartTime(){
        return this.startTime;
    }

    public void setStartTime(LocalDateTime startTime){
        this.startTime = startTime;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}
