package ulg.iloo;

public class Othello {

    public static void main(String[] args) throws Exception {
        
        if(args.length == 0) {
            args = new String[]{
                "ulg.iloo.group00.GUI",
                "ulg.iloo.group00.Game",
                "ulg.iloo.group00.ComputerPlayer",
                "ulg.iloo.group00.ComputerPlayer"
            };
        }
        
        for(String arg : args) {
        	System.out.println(arg);
        }

        IGUI gui = (IGUI)Class.forName(args[0]).newInstance();
        gui.setGame((IGame)Class.forName(args[1]).newInstance());
        gui.setComputerPlayers(
                (IPlayer)Class.forName(args[2]).newInstance(),
                (IPlayer)Class.forName(args[3]).newInstance());
        
        gui.exec();
        
        System.out.println("test");

    }

}
