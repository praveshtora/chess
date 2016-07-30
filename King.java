import java.awt.*;

/**
 * Created by torap on 7/30/2016.
 */
public class King extends Piece {
    public King(Color color, Square pos) {
        this.color=color;
        this.position=position;

    }

    @Override
    public boolean status() {
        return true;
    }

    @Override
    public void move(Square finalPostion) {

    }
}
