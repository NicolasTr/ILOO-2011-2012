package ulg.iloo;

public class Position {
    
    private char col;
    private int row;
    
    public Position(char col,int row) {
        this.col = col;
        this.row = row;
    }
    
    public char getCol() {
        return this.col;
    }
    
    public int getRow() {
        return this.row;
    }
    
    public void setCol(char col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
}
