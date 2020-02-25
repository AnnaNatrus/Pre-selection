
public class SequentialSearch {

	public static void main(String[] args) {
		int [] data = {158,207,392,62,315,434,487,268,405,241}; 
		int key = 62;
		
	    int r = 0;
		for (int i = 0; i < data.length; i++) {
	    	if (data[i]==key) {
	    		r = 1;
	    		System.out.println("index "+i);
	    	}	    		    	
	    } 
		if (r == 0) {System.out.println("no match");}
	}	
	
}
