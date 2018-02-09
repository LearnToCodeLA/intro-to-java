public class Player{

	Character symbol = null;
	Boolean status = false; //status is if winner
	Boolean isTurn = null;
	
	public Player(Character symbol){
		this.symbol = symbol;
	}
	
	public Character getSymbol(){
		return this.symbol;
	}
	
	public void setSymbol(Character symbol){
		this.symbol = symbol;
	}
	
	public Boolean getStatus(){
		return this.status;
	}
	
	public void setStatus(Boolean status){
		this.status = status;
	}
	
	public Boolean getIsTurn(){
		return this.isTurn;
	}
	
	public void setIsTurn(Boolean isTurn){
		this.isTurn = isTurn;
	}
}