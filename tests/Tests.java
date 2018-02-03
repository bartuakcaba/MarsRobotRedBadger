/**
 * Created by bartu on 03/02/2018.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

    Grid mars = new Grid(3,5);
    Robot robot= new Robot(0,0,Direction.N);

    @Test
    public void isGridSizeCorrect() {
        assertEquals(4, mars.grid.length);
        assertEquals(6, mars.grid[0].length);
    }

    @Test
    public void initialRobotLocation() {
        assertEquals(0, robot.x);
        assertEquals(0, robot.y);
        assertEquals(Direction.N, robot.dir);
    }


    @Test
    public void turnRobotRigt() {
        robot.turnRight();
        assertEquals(0, robot.x);
        assertEquals(0, robot.y);
        assertEquals(Direction.E, robot.dir);
    }

    @Test
    public void LeftTwice() {
        robot.turnLeft();
        robot.turnLeft();
        assertEquals(0, robot.x);
        assertEquals(0, robot.y);
        assertEquals(Direction.S, robot.dir);
    }

    @Test
    public void turnRobotManyRigt() {
        robot.turnRight();
        robot.turnRight();
        robot.turnRight();
        robot.turnRight();
        robot.turnRight();
        robot.turnRight();
        robot.turnRight();
        assertEquals(0, robot.x);
        assertEquals(0, robot.y);
        assertEquals(Direction.W, robot.dir);
    }


}