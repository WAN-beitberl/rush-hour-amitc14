package game;

public class Car {
    private char type;
    private int length;
    private int xPos;
    private int yPos;
    private boolean orientation;

    public Car(char type, int length, int xPos, int yPos, boolean orientation) {
        this.type = type;
        this.length = length;
        this.xPos = xPos;
        this.yPos = yPos;
        this.orientation = orientation;
    }

    public char getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public boolean getOrientation() {
        return orientation;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
