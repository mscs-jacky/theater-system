package TheaterSystem;

public class Theater {
    private String theaterName;
    private String theaterLocation;

    public Theater() {
        this.theaterName = "";
        this.theaterLocation = "";
    }

    public Theater(String theaterName, String theaterLocation) {
        this.theaterName = theaterName;
        this.theaterLocation = theaterLocation;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterLocation() {
        return theaterLocation;
    }

    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }

    @Override
    public String toString() {
        return theaterName+": "+theaterLocation;
    }
}
