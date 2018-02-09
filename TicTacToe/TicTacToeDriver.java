import java.util.Scanner;

public class TicTacToeDriver{
	
	public static TicTacToe board;
	public static void main(String[] args){

		while (true) {
			TicTacToe board = new TicTacToe();
			//board.drawMove(0,0, 'x');
			Scanner input = new Scanner(System.in);
		
			while(!board.checkForWinner()){
				System.out.println("Which row?");
				int getRow = input.nextInt();
	
				System.out.println("Which index?");
				int getIndex = input.nextInt();

				board.playerMove(getRow,getIndex);
			}
			System.out.print("Would you like to play again? (y/n) : ");
			input.nextLine(); // ???
			String line = input.nextLine();
			if (line.length() != 0) {
				switch (line.charAt(0)) {
					case 'N': case 'n': return;
				}
			}
		}
	}
}
