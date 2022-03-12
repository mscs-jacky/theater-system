package TheaterSystem.Models;
import java.time.LocalDateTime; // import the LocalDateTime class

public class ShowTime {

    private LocalDateTime startTime;

    public ShowTime(LocalDateTime startTime){
        this.startTime = startTime;
    }

    public LocalDateTime getStartTime(){
        return this.startTime;
    }

    public void setStartTime(LocalDateTime startTime){
        this.startTime = startTime;
    }
}
