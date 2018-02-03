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

    /*If grid has a val >0, then a robot was lost at this point */
    public boolean getScent(int Xcord, int Ycord) {
        return grid[Xcord][Ycord] > 0;
    }


    /*Returns the direction that the grid that was lost at this point was heading*/
    public int getScentNo(int Xcord, int Ycord) {
        return grid[Xcord][Ycord];
    }

    /*Puts a scent corresponding to the direction robot was heading when gets lost */
    public void putScent(int Xcord, int Ycord, Direction dir) {
        grid[Xcord][Ycord] = dir.ordinal()+1;
    }
}
