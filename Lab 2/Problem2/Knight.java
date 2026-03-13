package Problem2;

public class Knight extends Piece {
    public Knight(Position a) { 
        super(a); 
    }

    @Override
    public boolean isLegalMove(Position b) {
        return (a.getColDiff(b) == 2 && a.getRowDiff(b) == 1) || 
               (a.getColDiff(b) == 1 && a.getRowDiff(b) == 2);
    }
}