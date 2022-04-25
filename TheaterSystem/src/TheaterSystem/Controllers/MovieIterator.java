package TheaterSystem.Controllers;
package TheaterSystem.Models;

public interface MovieIterator {
    public Movie getNext();
    public boolean hasMore();
}