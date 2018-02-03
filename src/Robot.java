/**
 * Created by bartu on 03/02/2018.
 */
public class Robot {

    public int x;
    public int y;
    public Direction dir;

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void turnRight() {
        dir = dir.next();

    }

    public void turnLeft() {

        dir = dir.prev();

    }


    public void moveForward() {
    }
}
