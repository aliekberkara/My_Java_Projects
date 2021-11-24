/*
Prime Numbers Are Numbers That Have No Exact Divisors Except 1 And Itself.
*/
package Basic_Exercises;

public class Prime_Numbers {

	public static void main(String[] args) {
		int number = 15;
		boolean prime = true;

		if (number < 2)
		{
			prime = false;
		}
		else
		{
			for (int i = 2; i <= (number / 2); i++)
			{
				if (number % i == 0)
				{
					if (number == 2)
					{
						prime = true;
					}
					else
					{
						prime = false;
					}
				}
			}
		}

		if (prime == true)
		{
			System.out.println("This Number is a Prime Number.");
		}
		else
		{
			System.out.println("This Number is not a Prime Number..");
		}
	}

}
