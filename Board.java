import java.util.ArrayList;

public class Board {
	Board parent;
	int t;
	int u;
	ArrayList<Board> children;
	String[] board = new String[9];
	
	
	public Board(){
		t = 0;
		for(int i = 0; i<9; i++){
			board[i] = " ";						
		}		
	}
	
	
	public Board play(int n){
		if(board[n].equals(" ")){
			Board b = new Board();
			b.board = board;
			if(t == 0){
			b.board[n] = "X";
			}else{
				b.board[n] = "O";
			}
			return b;
		}else{
			return null;
		}		
	}
	
	public ArrayList<Board> expand(){
		for(int i = 0; i<9; i++){
			if(board[i].equals(" ")){
				Board b = new Board();
				b.board = board;
				if(t == 0){
				b.board[i] = "X";
				}else{
					b.board[i] = "O";
				}
				children.add(b);
		
		}			
	}
		return children;
	}
	
	public void print(){
		System.out.println("-------");
		for(int i = 0; i<9; i++){
			if(i%3 == 0){
				System.out.println();
				}
				System.out.print("|"+ board[i] + "|");
			
			System.out.println("-------");
		}
		
	}
	
	public boolean terminate(){
		
		if(board[0].equals(board[1])&&board[1].equals(board[2])){
			if(board[0].equals("x")){
				u = 1;
			}else{
				u = -1;
			}
			return true;
		}
		if(board[3].equals(board[4])&&board[4].equals(board[5]))
			{if(board[3].equals("x")){
				u = 1;
			}else{
				u = -1;
			}
			return true;
			}
		if(board[6].equals(board[7])&&board[7].equals(board[8]))
			{if(board[6].equals("x")){
				u = 1;
			}else{
				u = -1;
			}			
			return true;
			}
		if(board[0].equals(board[3])&&board[3].equals(board[6]))
		{
			if(board[0].equals("x")){
				u = 1;
			}else{
				u = -1;
			}
			return true;
	}
		if(board[1].equals(board[4])&&board[4].equals(board[7])){
			if(board[1].equals("x")){
				u = 1;
			}else{
				u = -1;
			}
			return true;
	}
		if(board[2].equals(board[5])&&board[5].equals(board[8]))
			{if(board[2].equals("x")){
				u = 1;
			}else{
				u = -1;
			}
			return true;
			}
		if(board[0].equals(board[4])&&board[4].equals(board[8])){
			if(board[0].equals("x")){
				u = 1;
			}else{
				u = -1;
			}
			return true;
		}
		if(board[2].equals(board[4])&&board[4].equals(board[6]))
			{if(board[2].equals("x")){
				u = 1;
			}else{
				u = -1;
			}
			return true;
			}
		
		for(int i = 0; i<9; i++){
		     if(board[i].equals(" ")){
		    	 return false;
		     }
		   
		}
		u = 0;
		return true;
		
	}
	

}
