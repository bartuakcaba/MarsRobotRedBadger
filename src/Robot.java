/**
 * Created by bartu on 03/02/2018.
 */
public class Robot {

    public int x;
    public int y;
    public Direction dir;
    public boolean lost;

    /*Every robot has a grid instance because they need to know which planet they are on*/
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
        /*Checks if the scent matches the direction of movement of robot */
        if (grid.getScentNo(x,y) == dir.getDirectionNo()) return;

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

    /*Checks if Robot would get lost and marks that location*/
    public boolean getLost(int currCord, int maxCord) {

        if (currCord == maxCord) {
            lost = true;
            grid.putScent(x, y, dir);
        }

        return lost;
    }

    public boolean isLost() {
        return lost;
    }
}
