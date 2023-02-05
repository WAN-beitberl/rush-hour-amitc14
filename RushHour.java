package game;

import java.util.Scanner;

public class RushHour {
    private static final int SIZE = 6;

	public static void main(String[] args) {
        Board board = new Board();
        Car car = new Car('c', 2, 0, 2, true);
        Player player = new Player(2, 2, true);
        Truck truck = new Truck(1, 1, false);
        board.placeCar(player);
        board.placeCar(truck);
        board.display();

        Scanner sc = new Scanner(System.in);
        while (true) {
        	System.out.println("Choose a car to move: ");
        	String carToMove = sc.next();
        	if(carToMove == "Player") {
            System.out.println("Enter the number"
            		+ " of steps you want to move the player car:");
            int steps = sc.nextInt();
            System.out.println("Enter the direction"
            		+ " you want to move the player car (up, down, left, right):");
            String direction = sc.next();
            board.moveCar(player, steps, direction);
        	}
        	if(carToMove == "truck") {
        		 System.out.println("Enter the number"
                 		+ " of steps you want to move the truck:");
                 int steps = sc.nextInt();
                 System.out.println("Enter the direction"
                 		+ " you want to move the truck (up, down, left, right):");
                 String direction = sc.next();
                 board.moveCar(truck, steps, direction);
        	}
        	if(carToMove == "car") {
        		 System.out.println("Enter the number"
                 		+ " of steps you want to move the car:");
                 int steps = sc.nextInt();
                 System.out.println("Enter the direction"
                 		+ " you want to move the car (up, down, left, right):");
                 String direction = sc.next();
                 board.moveCar(car, steps, direction);
        	}
            board.display();

            if (player.getxPos() == SIZE - player.getLength()) {
                System.out.println("Congratulations! You won the game!");
                break;
            }
        }
    }
}
