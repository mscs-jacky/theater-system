package TheaterSystem.Controllers;

import TheaterSystem.Models.Movie;

import TheaterSystem.Models.ShowTime;

import java.util.ArrayList;

public class Controller {

    private static Controller controller = null;

    private MovieList movies;

    private ArrayList<ShowTime> movieTimes;

    private Controller() {}

    public static Controller getInstance(){

        if(controller == null){
            // apply thread safety by doing double-checking with synchronization
            synchronized(Controller.class) {
                if(controller == null) {
                    controller = new Controller();
                }
            }
        }
        return controller;
    }

    public ArrayList<Movie> getMovies(){
        return controller.movies.getList();
    }

    public ArrayList<ShowTime> getMovieTimes(){
        return controller.movieTimes;
    }

    public ConcreteMoveIterator getMovieIterator(){return controller.movies.createIterator()}
    public ConcreteMoveIterator getMovieIterator(Showtime st){return controller.movies.createIterator(st)}
}
