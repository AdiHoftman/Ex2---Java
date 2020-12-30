package Ex2;

public class Ex2{
	
	public static void main(String[] args) {
		}
		//System.out.println(f(poly[2], x));
	
	public static double f(double[] poly, double x) {
		double func = 1;
		for (int i=0; i<poly.length; i++) {
			func += (poly[i]*Math.pow(x, i));
		}
		return func;
	}
}