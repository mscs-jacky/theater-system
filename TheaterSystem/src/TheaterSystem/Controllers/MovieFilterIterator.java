package TheaterSystem.Controllers;
package TheaterSystem.Models;

public interface MovieFilterIterator {
    public MovieIterator createIterator();
    public MovieIterator createIterator(Showtime showtime);
}