public class TicTacToe{
	
	Character[] row0 = {' ', ' ', ' '};
	Character[] row1 = {' ', ' ', ' '};
	Character[] row2 = {' ', ' ', ' '};

	Player player1 = new Player('X');
	Player player2 = new Player('O');
		

	public TicTacToe(){

		drawBoard();
		
		player1.setIsTurn(true);
		player2.setIsTurn(false);
	
	}
	
	public void controlTurn(){
		
		if(player1.getIsTurn()){
			player1.setIsTurn(false);
			player2.setIsTurn(true);
		}
		else{
			player1.setIsTurn(true);
			player2.setIsTurn(false);
		}
	}
	
	public void playerMove(int x, int y){
		
		if(player1.getIsTurn()){
			drawMove(x, y, player1.getSymbol());
		}
		else{
			drawMove(x, y, player2.getSymbol());
		}
		
		controlTurn();
	}

	public void drawBoard(){
		System.out.println("");
		System.out.println("    0   1   2");
		System.out.println("0 | "+this.row0[0]+" | "+this.row0[1]+" | "+this.row0[2]);
		System.out.println("1 | "+this.row1[0]+" | "+this.row1[1]+" | "+this.row1[2]);
		System.out.println("2 | "+this.row2[0]+" | "+this.row2[1]+" | "+this.row2[2]);
	}

	public void drawMove(int x, int y, char c){

		if(checkMove(x, y)){

			if(x == 0){
				row0[y] = c;
			}
			else if(x == 1){
				row1[y] = c;
			}
			else if(x == 2){
				row2[y] = c;
			}

		}
		else{
			
			System.out.println("Spot already filled. Try again.");
			controlTurn();
		}
		

		drawBoard();	
	}

	public boolean checkMove(int x, int y){

		if(x == 0 && row0[y] == ' '){
			
				return true;
		}
		else if(x == 1 && row1[y] == ' '){

			return true;
		}
		
		else if(x == 2 && row2[y] == ' ')
		{

			return true;
		}

		else {
			return false;
		}

	}
	
	
	
	//TODO implement message for winner
	public boolean checkForWinner(){
		
		if(
			   row0[0] == 'X' && row0[1] == 'X' && row0[2] == 'X'
			|| row0[0] == 'X' && row1[1] == 'X' && row2[2] == 'X'
			|| row1[0] == 'X' && row1[1] == 'X' && row1[2] == 'X'
			|| row0[2] == 'X' && row1[1] == 'X' && row2[0] == 'X'
			|| row2[0] == 'X' && row2[1] == 'X' && row2[2] == 'X'
			|| row0[2] == 'X' && row1[2] == 'X' && row2[2] == 'X'
			|| row0[1] == 'X' && row1[1] == 'X' && row2[1] == 'X'
			|| row0[0] == 'X' && row1[0] == 'X' && row2[0] == 'X'
						
		){
			System.out.println("Player 1 wins!");	
			return true;
		}
		else if(
			   row0[0] == 'O' && row1[0] == 'O' && row2[0] == 'O'			
			|| row0[1] == 'O' && row1[1] == 'O' && row1[1] == 'O'			
			|| row0[2] == 'O' && row1[2] == 'O' && row2[2] == 'O'			
			|| row0[0] == 'O' && row0[1] == 'O' && row0[2] == 'O'
			|| row1[0] == 'O' && row1[1] == 'O' && row1[2] == 'O'
			|| row0[0] == 'O' && row1[1] == 'O' && row2[2] == 'O'
			|| row2[0] == 'O' && row2[1] == 'O' && row2[2] == 'O'
			|| row0[2] == 'O' && row1[1] == 'O' && row2[0] == 'O'
		){
			System.out.println("Player 2 wins!");
			return true;
		}
		else{
		
			return false;
		}
	}

}
