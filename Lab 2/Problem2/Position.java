package Problem2;

public class Position{
    private char column;
    private int row;
    public Position(char c, int r){
        this.column = c;
        this.row = r;
    }
    public char getColumn(){ 
        return column; 
    }
    public int getRow(){ 
        return row; 
    }
    public int getColDiff(Position b) {
        return Math.abs(this.column - b.getColumn());
    }
    public int getRowDiff(Position b) {
        return Math.abs(this.row - b.getRow());
    }
}