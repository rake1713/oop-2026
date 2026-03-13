package Problem2;

public class Queen extends Piece {
    public Queen(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        boolean asRook = (a.getColumn() == b.getColumn() || a.getRow() == b.getRow());
        boolean asBishop = (a.getColDiff(b) == a.getRowDiff(b));
        return (asRook || asBishop) && (a.getColDiff(b) + a.getRowDiff(b) != 0);
    }
}