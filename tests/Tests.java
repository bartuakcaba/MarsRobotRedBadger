/**
 * Created by bartu on 03/02/2018.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

    Grid mars = new Grid(3,5);

    @Test
    public void isGridSizeCorrect() {
        assertEquals(4, mars.grid.length);
        assertEquals(6, mars.grid[0].length);
    }

}