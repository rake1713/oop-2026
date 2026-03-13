package Problem2;

public class Tester {
    public static void main(String[] args) {
        Position start=new Position('d', 4); 
        
        Piece q=new Queen(start);
        Piece knight=new Knight(start);

        System.out.println("Queen d4 to h8 (diagonal): " + q.isLegalMove(new Position('h', 8))); 
        System.out.println("Queen d4 to d1 (vertical): " + q.isLegalMove(new Position('d', 1)));

        System.out.println("Knight d4 to f5 (L-shape): " + knight.isLegalMove(new Position('f', 5))); 
        System.out.println("Knight d4 to e4 (straight): " + knight.isLegalMove(new Position('e', 4))); 
    }
}
