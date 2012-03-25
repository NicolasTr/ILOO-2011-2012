package ulg.iloo;

public interface IGUI {
    
    public void setGame(IGame game);
    
    public void setComputerPlayers(IPlayer player1, IPlayer player2);
    
    public void exec();
    
}
