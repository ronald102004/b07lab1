public class Polynomial {
	double[] coefficients;

	public Polynomial() {
		coefficients = new double[0];
	}

	public Polynomial(double[] arr) {
		coefficients = arr;
	}

	public Polynomial add(Polynomial p) {
		double[] c;
		if(this.coefficients.length > p.coefficients.length){
			c = new double[this.coefficients.length];
		}
		else
		{
			c = new double[p.coefficients.length];
		}

		for(int i = 0; i < p.coefficients.length; i++)
		{
			c[i] = p.coefficients[i];

		}

		for(int j = 0; j < this.coefficients.length; j++)
		{
			c[j] = c[j] + this.coefficients[j];
		}
		return new Polynomial(c);
	}

	public double evaluate(double x){
		double sum = 0;
		double ex = 1;
		for(int i = 0; i < this.coefficients.length; i++)
		{
			sum = sum + this.coefficients[i]*ex;
			ex = ex*x;
		}

		return sum;
	}

	public boolean hasRoot(double x) {
		if(this.evaluate(x) == 0)
		{
			return true;
		}
		else{
			return false;
		}
	}


}