package game;

public class Board {
    public static final int SIZE = 6;
    private char[][] board = new char[SIZE][SIZE];

    public Board() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '.';
            }
        }
    }
    public void placeCar(Car car) {
        int xPos = car.getxPos();
        int yPos = car.getyPos();
        boolean orientation = car.getOrientation();
        int length = car.getLength();

        if (orientation) {
            for (int i = xPos; i < xPos + length; i++) {
                board[i][yPos] = car.getType();
            }
        } else {
            for (int i = yPos; i < yPos + length; i++) {
                board[xPos][i] = car.getType();
            }
        }
    }
    public void moveCar(Car car, int steps, String direction) {
        int xPos = car.getxPos();
        int yPos = car.getyPos();
        boolean orientation = car.getOrientation();
        int length = car.getLength();

        if (orientation) {
            if (direction.equals("left")) {
                for (int i = xPos; i < xPos + length; i++) {
                    board[i][yPos] = '.';
                }
                car.setyPos(yPos - steps);
                yPos = car.getyPos();
                for (int i = xPos; i < xPos + length; i++) {
                    board[i][yPos] = car.getType();
                }
            } else if (direction.equals("right")) {
                for (int i = xPos; i < xPos + length; i++) {
                    board[i][yPos] = '.';
                }
                car.setyPos(yPos + steps);
                yPos = car.getyPos();
                for (int i = xPos; i < xPos + length; i++) {
                    board[i][yPos] = car.getType();
                }
            }
        } else { if (direction.equals("up")) {
            for (int i = yPos; i < yPos + length; i++) {
                board[xPos][i] = '.';
            }
            car.setxPos(xPos - steps);
            xPos = car.getxPos();
            for (int i = yPos; i < yPos + length; i++) {
                board[xPos][i] = car.getType();
            }
        } else if (direction.equals("down")) {
            for (int i = yPos; i < yPos + length; i++) {
                board[xPos][i] = '.';
            }
            car.setxPos(xPos + steps);
            xPos = car.getxPos();
            for (int i = yPos; i < yPos + length; i++) {board[xPos][i] = car.getType();
            }
        }
    }
}

public void display() {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}
}
