package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrimeFactorisation {

	
	public static int isprime(int number)
	{
		if(number<0)
			return 0;
		if(number == 0|| number == 1)
			return 0;
		if(number == 2 || number ==3)
			return 1;
		
		int sqrt = (int)Math.sqrt(number) +1;
		for (int i=0;i<sqrt;i++)
			if(number%i==0)
				return 0;
		
		return 1;
	}
	
	public static  Set<Integer> find_prime_factors(int number)
	{
		Set<Integer> prime_fact = new HashSet<Integer>();
		int i=2;
		
		while(i<=number)
		{
			if(number%i ==0)
			{
				number = number/i;
				prime_fact.add(i);
			}
			else
				i++;
		}
		return prime_fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = find_prime_factors(56);
		System.out.println("size of the set:"+ set.size());
		for(int i :set)
			System.out.println(i);
		

	}

}
