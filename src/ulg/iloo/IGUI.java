package ulg.iloo;

public interface IGUI {
    
    /**
     * Fournit la représentation du jeu
     */
    public void setGame(IGame game);
    
    /**
     * Fournit les joueurs automatiques
     */
    public void setComputerPlayers(IPlayer player1, IPlayer player2);
    
    /**
     * Exécute le programme
     */
    public void exec();
    
}
