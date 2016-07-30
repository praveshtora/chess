import java.awt.*;

/**
 * Created by torap on 7/30/2016.
 */
public class Pawn extends ChessMan {
     public  boolean status(){
         return true;
     }
    public Pawn(Color color, Square pos) {
        this.color=color;
        this.position=pos;
    }
    @Override
    public void move(Square finalPostion) {


    }
    public void promote(){

    }
    public void enpassant() {

    }
    
    public void capture(){
         
    }
}
