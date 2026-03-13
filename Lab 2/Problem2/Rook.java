package Problem2;

public class Rook extends Piece {
    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return a.getColumn() == b.getColumn() || a.getRow() == b.getRow();
    }
}
