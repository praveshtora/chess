/**
 * Created by torap on 7/30/2016.
 */
public class Square {
    private int x;
    private  int y;

    public Square(int x,int y) {
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setSquare(int i,int j) {
        x=i;
        y=j;

    }
}
