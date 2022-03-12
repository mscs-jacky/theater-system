package TheaterSystem.Controllers;

import TheaterSystem.Models.Movie;

import TheaterSystem.Models.ShowTime;

import java.util.ArrayList;

public class Controller {

    private static Controller controller = null;

    private ArrayList<Movie> movies;

    private ArrayList<ShowTime> movieTimes;

    private Controller(){

    }

    public static Controller getInstance(){
        if(controller == null){
            controller = new Controller();
        }
        return controller;
    }

    public ArrayList<Movie> getMovies(){
        return movies;
    }

    public ArrayList<ShowTime> getMovieTimes(){
        return movieTimes;
    }

}
