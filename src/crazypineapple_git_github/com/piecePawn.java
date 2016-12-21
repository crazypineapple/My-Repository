package crazypineapple_git_github.com;

public class piecePawn extends pieceChess{
	private boolean firstMove;//Check whether the piece can move two spaces or not
	private int direction;
	
	public piecePawn(int newX, int newY, String newType, String newColor) {
		super(newX, newY, newType, newColor);
		firstMove = true;
		if (newColor.equalsIgnoreCase("white"))
			direction = 1;
		else
			direction = -1;
	}

	@Override
	public void move(int newX, int newY) {
		// TODO Auto-generated method stub
		if (direction<0){
			
		}
	}

}
