/**
 * Created by bartu on 03/02/2018.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

    Grid mars = new Grid(3,5);
    Robot robot= new Robot(0,0,Direction.N, mars);

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
    public void turnRobotLeftTwice() {
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

    @Test
    public void moveRobotTwice() {
        robot.moveForward();
        robot.moveForward();
        assertEquals(0, robot.x);
        assertEquals(2, robot.y);
        assertEquals(Direction.N, robot.dir);
    }

    @Test
    public void moveRobotRightForward() {
        robot.moveForward();
        robot.turnRight();
        robot.moveForward();
        assertEquals(1, robot.x);
        assertEquals(1, robot.y);
        assertEquals(Direction.E, robot.dir);
    }

    @Test
    public void isRobotLost() {
        assertEquals(false, robot.isLost());
    }

    @Test
    public void isRobotLostbyMovingForward() {
        robot.moveForward();
        robot.moveForward();
        robot.moveForward();
        robot.moveForward();
        robot.moveForward();
        robot.moveForward();
        robot.moveForward();
        assertEquals(0, robot.x);
        assertEquals(5, robot.y);
        assertEquals(true, robot.isLost());
    }

    @Test
    public void isRobotLostbyGoingWest() {
        robot.moveForward();
        robot.turnLeft();
        robot.moveForward();
        assertEquals(0, robot.x);
        assertEquals(1, robot.y);
        assertEquals(true, robot.isLost());
    }

    @Test
    public void markGridWithScent() {
        robot.moveForward();
        robot.turnLeft();
        robot.moveForward();
        assertEquals(true, mars.getScent(robot.x,robot.y));
    }

    @Test
    public void doesSecondRobotFallWithScent() {


        robot.moveForward();
        robot.turnLeft();
        robot.moveForward();

        assertEquals(0, robot.x);
        assertEquals(1, robot.y);
        assertEquals(true, robot.isLost());

        Robot robot2 = new Robot(0,1,Direction.W, mars);

        robot2.moveForward();

        assertEquals(true, mars.getScent(robot.x,robot.y));
        assertEquals(0, robot2.x);
        assertEquals(1, robot2.y);
        assertEquals(false, robot2.isLost());

        Robot robot3 = new Robot(0,1,Direction.E, mars);
        robot3.moveForward();

        assertEquals(1, robot3.x);
        assertEquals(1, robot3.y);
        assertEquals(false, robot3.isLost());
    }





}