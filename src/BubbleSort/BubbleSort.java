
public class BubbleSort {
		
	public static void main(String[] args) {
		int[] data = {206,430,73,30,293,322,42,36,447,229};
		System.out.print("data: ");
		arrayToString(data);
		desc(data);
		arrayToString(data);
		asc(data);
		arrayToString(data);
	}

	static void desc(int[] data) {
		System.out.print("desc: ");
		boolean needIteration = true;
		while (needIteration) {
	    	 needIteration = false;
	    	 for (int i = 0; i < data.length-1; i++){
	    	 		if (data[i] < data[i+1]) {
	    	 			int tmp = data[i];
	    	 			data[i] = data[i+1];
	    	 			data[i+1] = tmp;
	    	 			needIteration = true;
	    	 	}
	    	}
	    }
	}
	
	static void asc(int[] data) {
		System.out.print("asc: ");
		boolean needIteration = true;
		while (needIteration) {
	    	 needIteration = false;
	    	 for (int i = 0; i < data.length-1; i++){
	    	 		if (data[i] > data[i+1]) {
	    	 			int tmp = data[i];
	    	 			data[i] = data[i+1];
	    	 			data[i+1] = tmp;
	    	 			needIteration = true;
	    	 	}
	    	}
	    }
	}
	
	
	static void arrayToString(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
	
}
