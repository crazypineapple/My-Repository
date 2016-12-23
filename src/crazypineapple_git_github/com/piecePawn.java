package crazypineapple_git_github.com;

public class piecePawn extends pieceChess{
	private boolean firstMove;//Check whether the piece can move two spaces or not
	private int direction;
	
	public piecePawn(int newX, int newY, String newType, String newColor, gameBoard newBoard) {
		super(newX, newY, newType, newColor, newBoard);
		firstMove = true;
		if (newColor.equalsIgnoreCase("white"))
			direction = 1;
		else
			direction = -1;
	}

	@Override
	public void move(int newX, int newY) {
		// TODO Auto-generated method stub
		if(this.checkBounds(newX, newY))
			if((newX != this.x || Math.abs(this.x-newX)!=1) && board.getPiece(newX, newY)==null){
				System.out.println("Illegal Move");
				return;
			}
			int verticalMove = direction*(this.y-newY);
			if(verticalMove<0 && Math.abs(verticalMove)<=2){
				if(!firstMove && Math.abs(verticalMove)==2){
					System.out.println("Illegal Move");
					return;
				}
				firstMove = false;
				board.addPiece(this, newX, newY);
				board.removePiece(this.x, this.y);
				this.x = newX;
				this.y = newY;
			}
	}

}
