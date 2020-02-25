
public class EquationSimple {

	public static void main(String[] args) {
		
		double a = 1; 
		double b = 1;
		double c = -6;
		
			System.out.println("ax^2+bx+c=0");
			System.out.println(a+"x^2+"+b+"x+"+c+"=0.0");
			System.out.println();
			System.out.println("Result:");
			
		double x1;
		double x2;
		
		x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}
	
}
