/*
 * Explore efficiency of different ways of
 * computing x raised to the power n.
 */

public class Powers {
	public static void main(String[] args) {
		double x = 1.00001, z;
		int MAXCOUNT = 1000;
		int STARTCOUNT = 100;
		int[] rt = new int[MAXCOUNT];
		for (int n = STARTCOUNT; n < MAXCOUNT; ++n) {
			System.out.println(n);
			long start = System.currentTimeMillis();
			for (long k = 0; k < 1000000; ++k)
				//z = lpow(x, n);
				//z = rpow(x, n);
				//z = rpow2(x, n);
			    z = ipow(x,n);
			long totalTime = System.currentTimeMillis() - start;
			rt[n] = (int) totalTime;
		}
		plot(rt);
	}

	static double lpow(double x, int n) { // linear time approach
		double y = x;
		for (int i = 1; i < n; ++i)
			y *= x;
		return y;
	}

	static double rpow(double x, int n) { // simple recursive approach
		if (n == 0)
			return 1.0;
		return x * rpow(x, n - 1);
	}

	static double rpow2(double x, int n) { // a more sophisticated recursive approach
		if (n == 0)
			return 1.0;
		if (n % 2 == 1) // n is odd
		{
			double y = rpow2(x, (n - 1) / 2);
			return x * y * y;
		} else {
			double y = rpow2(x, n / 2);
			return y * y;
		}
	}
	
	static double ipow(double base, int exp) { // nonrecursive version
		double result = 1.0;
		while (exp != 0) {
			if ((exp & 1) == 1)
				result *= base;
			exp >>= 1;
			base *= base;
		}
		return result;
	}


	static void plot(int[] d) {
		for (int i = 0; i < d.length; ++i)
			System.out.println(i + "  " + d[i]);
	}
}
