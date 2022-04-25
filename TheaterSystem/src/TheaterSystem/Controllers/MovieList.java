package TheaterSystem.Controllers;
package TheaterSystem.Models;

public class MovieList implements MovieFilterIterator{
    private Movie[] list = [];

    public MovieList(Movie[] movies){
        this.list = movies;
    }

    Movie[] getList(){
        return list;
    }

    public MovieIterator createIterator(){
        return new ConcreteMovieIterator(this);
    }
    public MovieIterator createIterator(Showtime showtime){
        return new ConcreteMovieIterator(this, showtime);
    }
}