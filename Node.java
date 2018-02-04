import java.util.ArrayList;
public class Node{
        static Players computer;
        
        int u;
        Board state;
        ArrayList<Node> children;
        
        public Node() {
    		children = new ArrayList<Node>();
    	}
}
