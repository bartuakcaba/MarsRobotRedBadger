/**
 * Created by bartu on 03/02/2018.
 */
public class Grid {

    public int[][] grid;
    int maxX;
    int maxY;

    public Grid(int maxX, int maxY) {
        grid = new int[maxX+1][maxY+1];
        this.maxX = maxX;
        this.maxY = maxY;
    }
}
