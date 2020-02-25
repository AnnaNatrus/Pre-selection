package test;

public class Accounting {
	double hours;
	double hourPayment;

	public double pay(double hours, double hourPayment) {
		double pay = hours*hourPayment;
		return pay;
	}
	
}
