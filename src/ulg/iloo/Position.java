package ulg.iloo;

public class Position {
    
    private char col;
    private int row;
    
    public Position(char col,int row) {
        this.col = col;
        this.row = row;
    }
    
    char getCol() {
        return this.col;
    }
    
    int  getRow() {
        return this.row;
    }
    
    void setCol(char col) {
        this.col = col;
    }

    void setRow(int row) {
        this.row = row;
    }
    
}
