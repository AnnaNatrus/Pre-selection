import java.util.Arrays;

public class StatisticalInformation {

	public static void main(String[] args) {
		int[] data = {206,430,73,30,293,322,42,36,447,206};
		System.out.println("mean: "+mean(data));
		median(data);
		moda(data);
		stDev(data);
	}
		
	static double mean(int[] data) {
		double summ = 0;
			for (int i = 0; i < data.length; i++) {
		        summ = summ + data[i];
		    }
		    return summ / data.length;		   
	}
	
	static void median(int[] data) {
		Arrays.sort(data);
		double med;
		int i = data.length/2;
	
		if (data.length % 2 == 0) {
			med = (data[i-1]+data[i])/2.0;
		} 
		else {med = data[i];
		}	
		System.out.println("median: "+med);
	}
	
	static void moda(int[] data) {
        int count = 1;
        int maxCount = 1;
        int mod = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] == data[i - 1]) {
                count++;
            } 
            else {
                count = 1;
            }
            if(count > maxCount) {
                mod = data[i];
            } 
 
        }
        System.out.println("moda: " + mod);
	}
	
	static void stDev(int[] data) {
        double mean1 = mean(data);
        double sum = 0;
        for (int element : data) {
            sum += Math.pow(element - mean1, 2);
        }

        System.out.println("standard deviation: " + Math.sqrt(sum / data.length));
    }
}


	
	
	
	

