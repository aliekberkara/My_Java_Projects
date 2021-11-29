package Basic_Exercises;

import java.util.ArrayList;

public class Inner_Classes {
	public class Prime_Number{
		public boolean PrimeNumber(int primeNumber) {
			int divisor = 0;
			boolean control;
			for (int i = 2; i < primeNumber; i++) {
				if (primeNumber % i == 0) {
					divisor++;
				}
			}
			if (divisor == 0) {
				control = true;
			}
			else {
				control = false;
			}
			return control;
		}
	}
	protected class Perfect_Number{
		protected boolean PerfectNumber(int perfectNumber) {
			int totalDivisor = 0;
			boolean control;
			for (int i = 1; i < perfectNumber; i++) {
				if(perfectNumber % i == 0) {
					totalDivisor += i;
				}
			}
			if(totalDivisor == perfectNumber) {
				control = true;
			}
			else {
				control = false;
			}
			return control;
		}
	}

	private class Fibonacci {
		private ArrayList<Integer> Fibonaccii(int elementNumber) {
			ArrayList<Integer> fibonacci = new ArrayList<Integer>();
			fibonacci.add(0, 1);
			fibonacci.add(1, 1);
			for (int i = 0; i < elementNumber-2; i++) {
				fibonacci.add(i+2, fibonacci.get(i) + fibonacci.get(i+1));
			}
			return fibonacci;
		}
	}
	public static void main(String[] args) {
		Main_Class.Prime_Number prime_Number = new Main_Class().new Prime_Number();
		Main_Class.Perfect_Number perfect_Number = new Main_Class().new Perfect_Number();
		Main_Class.Fibonacci fibonacci = new Main_Class().new Fibonacci();

		System.out.println(prime_Number.PrimeNumber(5));
		System.out.println(perfect_Number.PerfectNumber(495));
		System.out.println(fibonacci.Fibonaccii(7));
		System.out.println(prime_Number.PrimeNumber(653));
		System.out.println(perfect_Number.PerfectNumber(8128));
		System.out.println(fibonacci.Fibonaccii(13));
	}
}
