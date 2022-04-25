package TheaterSystem.Controllers;
package TheaterSystem.Models;

public class ConcreteMovieIterator implements MovieIterator{

    private int currentPosition = 0;
    private MovieList list;
    private Movie[] cache;
    private Showtime filter;

    public ConcreteMovieIterator(MovieList list){
        this.list = list;
        this.filter = null;
    }

    public ConcreteMovieIterator(MovieList list, Showtime showtime){
        this.list = list;
        this.filter = showtime;
    }

    public Movie getMovie(){
        if(hasMore())
            return cache[currentPosition++];
        return null;
    }

    public boolean hasMore(){
        if(cache == null)
            cache = list.getList();
        return currentPosition < cache.length;
    }
}