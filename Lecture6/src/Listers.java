import java.io.*;
import java.util.*;

public class Listers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner keys = new Scanner(System.in);
    	List<Integer> L = new ArrayList<Integer>();
    	int N = keys.nextInt();
    	
    	for (int i = 0; i < N; i++) {
    		int val = keys.nextInt();
    		keys.nextLine();
    		L.add(val);
    	}
    	
    	int Q = keys.nextInt();
    	keys.nextLine();
    	
    	for (int i = 0; i < Q; i++) {
    		System.out.println("Make Query");
    		String query = keys.next();
    		
    		if (query.equals("Insert")) {
    			int team = keys.nextInt();
                int test = keys.nextInt();
                L.add(team, test);
    		} else if (query.equals("Delete")){
    			int team = keys.nextInt();
                L.remove(team);
    		}
    	}
    	
    	for (int n : L) {
    		System.out.print(n + " ");
    	}
    }
}

