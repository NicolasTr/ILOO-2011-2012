package ulg.iloo;

public interface IPlayer {

    public static final int BLACK = 0;
    public static final int WHITE = 1;
    public static final int NONE = 2;
    public static final int TIE = 3;    
    
    public Position play(IGame game);
    
}
