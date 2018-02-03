/**
 * Created by bartu on 03/02/2018.
 */
public class Robot {

    public int x;
    public int y;
    public Direction dir;
    public boolean lost;

    private Grid grid;

    public Robot(int x, int y, Direction dir, Grid grid) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        lost = false;

        this.grid = grid;
    }

    public void turnRight() {
        dir = dir.next();
    }

    public void turnLeft() {
        dir = dir.prev();
    }


    public void moveForward() {
        switch (dir) {
            case N:
                y++;
                getLost(y, grid.maxY);
                break;
            case E:
                x++;
                getLost(x, grid.maxX);
                break;
            case S:
                y--;
                getLost(y, 0);
                break;
            case W:
                x--;
                getLost(x, 0);
                break;
        }
    }

    public void getLost(int currCord, int maxCord) {

        if (currCord> maxCord) {
            lost = true;
        }
    }

    public boolean isLost() {
        return lost;
    }
}
