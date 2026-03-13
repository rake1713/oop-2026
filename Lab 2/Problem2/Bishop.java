package Problem2;

public class Bishop extends Piece {
    public Bishop(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        return a.getColDiff(b) == a.getRowDiff(b) && a.getColDiff(b) != 0;
    }
}
