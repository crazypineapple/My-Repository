package crazypineapple_git_github.com;

public abstract class pieceChess {
	protected int x;
	protected int y;
	private String type;
	private String color;
	protected gameBoard board;
	
	public pieceChess(int newX, int newY, String newType, String newColor, gameBoard newBoard){
		x = newX;
		y = newY;
		type = newType;
		color = newColor;
		board = newBoard;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String getType(){
		return type;
	}
	
	public boolean checkBounds(int newX, int newY){
		if (0<=newX && newX<=7)
			if (0<=newY && newY<=7)
				return true;
		return false;
	}
	
	public abstract void move(int newX, int newY);
}
