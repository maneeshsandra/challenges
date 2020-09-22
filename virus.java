/*There are N people in a city.(N > 100). Out of N already N/6 people are
effected with virus.
Consider the following scenario and print in how many days the city will
be free from virus?
1. Daily 10 new people are effecting with virus at the same time, 15
people are cured from virus.
2. once a person got effected and cured then he won't effect again.
you also need to print is there any one left without gets effected. i.e.
if the virus ends without reaching the last person, then you need to
print the number of people who are not effected from virus. otherwise
print 0.*/

package safe_people;

import java.util.Scanner;
import java.lang.Math;

public class SafePeople {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the population of city");
		int n,affected,remaining;
		int days=0;
		n = sc.nextInt();
		System.out.println("The total population is"+n);
		affected=n/6;
		System.out.println("No.of affected already "+affected);//
		remaining=n-affected;
		while(affected>0)
		{
			days=days+1;
			affected=affected+10-15;
			//affected=affected-15;
			remaining=remaining-10;
			
			
		}
		System.out.println("No.of days "+days);
		if(n>0) {
			System.out.println("No.of remaining is"+remaining);
			
		}
		else {
			System.out.println("no.of remaining is 0");
		}
		
		
	}
}
			
			
			
			
			
			
			
			
		
