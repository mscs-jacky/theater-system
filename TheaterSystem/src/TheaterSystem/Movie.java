package TheaterSystem;

import java.util.ArrayList;

public class Movie {
    private String movieName;
    private String directorName;
    private ArrayList<String> actorNames;
    private double runTime;

    public Movie(String movieName, String directorName, ArrayList<String>  actorNames, double runTime) {
        this.movieName = movieName;
        this.directorName = directorName;
        this.actorNames = actorNames;
        this.runTime = runTime;
    }

    public Movie(String movieName, double runTime) {
        this.movieName = movieName;
        this.directorName = "";
        this.actorNames = new ArrayList<>();
        this.runTime = runTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public ArrayList<String> getActorNames() {
        return actorNames;
    }

    public void setActorNames(ArrayList<String> actorNames) {
        this.actorNames = actorNames;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }
}
