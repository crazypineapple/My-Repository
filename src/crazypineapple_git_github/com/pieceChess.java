package crazypineapple_git_github.com;

public abstract class pieceChess {
	private int x;
	private int y;
	private String type;
	private String color;
	
	public pieceChess(int newX, int newY, String newType, String newColor){
		x = newX;
		y = newY;
		type = newType;
		color = newColor;
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
	
	public abstract void move(int newX, int newY);
}
