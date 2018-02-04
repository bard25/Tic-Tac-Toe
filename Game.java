import java.util.Scanner;
import java.util.*;
import java.util.Stack;
public class Game {
    
	public void graphSearch(){
		Stack<Board> frontier = new Stack<Board>();
		ArrayList<Board> explored = new ArrayList<Board>();
		while(true){
			if(frontier.isEmpty()){
				break;
			}
			Board node = frontier.pop();
			if(node.terminate()){
				
			}
			explored.add(node);
			for(Board n : node.children){
				if(!explored.contains(n)){
					frontier.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Board b = new Board();
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter");
		 b.play(s.nextInt());
        s.close();
        b.print();
	}

}
