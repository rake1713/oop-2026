package Problem2;

public class King extends Piece {
    public King(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        return a.getColDiff(b) <= 1 && a.getRowDiff(b) <= 1 && (a.getColDiff(b) + a.getRowDiff(b) != 0);
    }
}
