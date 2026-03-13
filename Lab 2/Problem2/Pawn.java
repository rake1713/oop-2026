package Problem2;

public class Pawn extends Piece {
    public Pawn(Position a) {
        super(a); 
    }

    @Override
    public boolean isLegalMove(Position b){
        return a.getColumn() == b.getColumn() && (b.getRow() - a.getRow() == 1);
    }
}
