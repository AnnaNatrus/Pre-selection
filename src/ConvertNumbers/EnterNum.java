package test;

public class EnterNum {

	public static void main(String[] args) {
		ConvertNumbers convert = new ConvertNumbers();
		
	        for (int i = 10; i <= 150; i++) {
	            System.out.println(convert.numberToWord(i));
	        }
	        for (int i = 9980; i <= 10000; i++) {
	            System.out.println(convert.numberToWord(i));
	        }
	    }

}
