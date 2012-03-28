package ulg.iloo;

public interface IGame {
    
    public static final int BLACK = 0;
    public static final int WHITE = 1;
    public static final int NONE = 2;
    public static final int TIE = 3;    
    
    /**
     * Annule le dernier coup
     */
    public void undo();
    
    /**
     * Joue la couleur getTurn() à la position @param position
     */
    public Iterable<Position> play(Position position);
    
    /**
     * Renvoie la couleur du pion à la position @param position
     *
     * @return La couleur du pion (BLACK ou WHITE), NONE si la case est vide
     */
    public int getPositionValue(Position position);
    
    /**
     * Renvoie la couleur du prochain pion à placer
     *
     * @return La couleur du pion (BLACK ou WHITE)
     */
    public int getTurn();
    
    /**
     * Indique si la partie est terminée
     *
     * @return true  si la partie est terminée,
     *         false si la partie est toujours en cours
     */
    public boolean isEnd();
    
    /**
     * Renvoie le gagnant de la partie
     *
     * @return La couleur du gagnant si il y en a un (BLACK ou WHITE),
     *         TIE si la partie s'est terminée par un match nul,
     *         NONE si la partie est toujours en cours
     */
    public int winner();
    
    /**
     * Recommence le jeu
     */
     public void reset();
    
}
