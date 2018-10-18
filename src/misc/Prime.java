package misc;

import java.time.LocalDateTime;

public class Prime {

	public static void main(String[] args) {
		boolean flag = true;
		int n = 1,j=1 ;

		while(j<=10) {
		for(int i = 2;i <=j-1;i++) 
		{
			if(j%i==0)
			{
				flag=false;
				j++;
				break;
			}
		}
		if(flag==false)
			System.out.println(j + "  is not a prime");
		else
			System.out.println(j + " is prime");
		
		}
	}
}
