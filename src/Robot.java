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
        if (lost) return;

        switch (dir) {
            case N:
                 if (!getLost(y, grid.maxY)) {
                     y++;
                 }
                break;
            case E:
                if (!getLost(x, grid.maxX)) {
                    x++;
                }
                break;
            case S:
                if (!getLost(y, 0)) {
                    y--;
                }
                break;
            case W:
                if (!getLost(x, 0)) {
                    x--;
                }
                break;
        }
    }

    public boolean getLost(int currCord, int maxCord) {

        if (currCord == maxCord) {
            lost = true;
        }

        return lost;
    }

    public boolean isLost() {
        return lost;
    }
}
