package ulg.iloo.group00;

import ulg.iloo.IGame;
import ulg.iloo.Position;

public class Game implements IGame {

    @Override
    public void undo() {

    }

    @Override
    public void play(Position position) {

    }

    @Override
    public int getPositionValue(Position position) {
        return 0;
    }

    @Override
    public boolean isEnd() {
        return true;
    }

    @Override
    public int winner() {
        return 0;
    }
    
}
