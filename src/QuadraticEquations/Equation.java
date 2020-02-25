
public class Equation {

	public static void main(String[] args) {
		double a = 9; //D=0 (9x^2+6x+1=0); D<0 (2x^2-3x+4=0); D>0 (x^2+x-6=0)
		double b = 6;
		double c = 1;
			System.out.println("ax^2+bx+c=0");
			System.out.println(a+"x^2+"+b+"x+"+c+"=0.0");
		double x1;
		double x2;
		double Vd = Math.sqrt(b*b-4*a*c); //double d = b*b-4*a*c;
			System.out.println();
			System.out.println("Result:");
		x1 = (-b+Vd)/(2*a);
		x2 = (-b-Vd)/(2*a);
	//	double x = -b/(2*a);
		if ( a==0) { 
			System.out.println ("Specify a different value, 'a' should not be equal to '0'.");
		}
		else if (x1==x2) {
			System.out.println ("x="+x1);
			System.out.println ("The equation has only one root (D = 0).");
		}
	/*else if (d==0) {
		System.out.println ("x="+x);
		System.out.println ("The equation has only one root (D = 0)");
	}*/
		else if (Double.isNaN(Vd)) {
			System.out.println ("The equation has no root (D < 0).");
		}
		else {
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}
	}

}
