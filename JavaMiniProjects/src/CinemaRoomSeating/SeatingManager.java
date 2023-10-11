package CinemaRoomSeating;
import java.util.Scanner;

public class SeatingManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cinema");
		System.out.println("1 2 3 4 5 6 7 8");
		
		for(int i = 0; i < 8; i++) {
			System.out.println(i + " ");
			for(int j = 1; j< 9; j++  ) {
				System.out.println("s");

			}
			System.out.println();

		}
		
		
		System.out.println("Enter the number of rows: ");
		int numberOfRows = scanner.nextInt();
		System.out.println("Enter the number of seat in each row");
		int numberOfSeats = scanner.nextInt();
		
		
	}

}
