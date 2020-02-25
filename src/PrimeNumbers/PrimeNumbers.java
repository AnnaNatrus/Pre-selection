
public class PrimeNumbers {

	public static void main(String[] args) {
		
		long from = 0;
		long to = 5000;
		long count;
		
		for(long i = from ; i <= to ; i++)
		{
			count = 0;
			for(long j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}

	}

}
