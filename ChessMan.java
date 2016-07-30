import java.awt.*;

/**
 * Created by torap on 7/30/2016.
 */
public abstract class ChessMan {
    public Color color;
    public Square position;

    public abstract boolean status();

    public abstract void move(Square finalPostion);



}
