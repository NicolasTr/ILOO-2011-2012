package ulg.iloo;

public interface IGame {
    
    public static final int BLACK = 0;
    public static final int WHITE = 1;
    public static final int NONE = 2;
    public static final int TIE = 3;    
    
    public void undo();
    
    public Iterable<Position> play(Position position);
    
    public int getPositionValue(Position position);
    
    public int getTurn();
    
    public boolean isEnd();
    
    public int winner();
    
}
