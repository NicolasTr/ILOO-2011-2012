package ulg.iloo;

public interface IPlayer {
    
    /**
     * Renvoie le prochain cou du joueur
     *
     * @return La position à la quelle le joueur souhaite placer le prochain pion,
     *         null si le tableau est plein ou si le joueur ne peut pas jouer.
     */    
    public Position play(IGame game);
    
}
