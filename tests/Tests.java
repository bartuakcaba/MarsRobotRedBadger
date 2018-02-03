/**
 * Created by bartu on 03/02/2018.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

    Grid mars = new Grid();

    @Test
    public void isGridSizeCorrect() {
        assertEquals(0, mars.grid.length);
    }
}