package crazypineapple_git_github.com;

public class gameBoard {
	private pieceChess[][] board;
	
	public gameBoard(){
		board = new pieceChess[8][8];
	}
	
	public pieceChess[][] getBoard(){
		return board;
	}
	
	public void addPiece(pieceChess piece, int x, int y){
		board[y][x] = piece;
	}
	
	public void removePiece(int x, int y){
		board[y][x] = null;
	}
	
	public pieceChess getPiece(int x, int y){
		return board[y][x];
	}
	
//	public static void main(String[]args){
//		pieceChess[][] lboard = new pieceChess[8][8];
//		for (int y=0; y<lboard.length;y++)
//			for (int x=0; x<lboard.length; x++){
//				System.out.println(lboard[y][x]);
//			}
//	}
}
