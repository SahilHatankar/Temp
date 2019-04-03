package temp;
import java.util.Scanner;
public class Result {
	static int n=0;
		
	static Boolean ans(int wt){
		if (wt == 0){
			return true;
		}
		else{
		if(wt==14){
			wt = wt - 14;
			n=n+2;
			if (ans(wt)==true)
			{
				return true;
			}
			wt= wt+14;
			n = n-2;
		}
		else if(wt==15){
			wt = wt - 15;
			n=n+2;
			if (ans(wt)==true)
			{
				return true;
			}
			wt= wt+15;
			n = n-2;
			
		}
		else if(wt>=11){
			wt = wt - 11;
			n++;
			if (ans(wt)==true)
			{
				return true;
			}
			wt= wt+11;
			n = n-1;
		}
		else if(wt>=9){
			wt = wt - 9;
			n++;
			if (ans(wt)==true)
			{
				return true;
			}
			wt= wt+9;
			n = n-1;
			
		}
		else if(wt>=7){
			wt = wt - 7;
			n++;
			if (ans(wt)==true)
			{
				return true;
			}
			wt= wt+7;
			n = n-1;
			
		}
		else if(wt>=5){
			wt = wt - 5;
			n++;
			if (ans(wt)==true)
			{
				return true;
			}
			wt= wt+5;
			n = n-1;
			
		}
		else {
			wt = wt - 1;
			n++;
			if (ans(wt)==true)
			{
				return true;
			}
			wt= wt+1;
			n = n-1;
			
		}}
		
		return false;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int wt=1;
		 int num= 0;
		 int again= 0;
		 do{
		 System.out.println("Enter Weight(1-250)");
		Scanner in = new Scanner(System.in);
		wt = in.nextInt();
		if((wt <= 250) && (wt>=1))
		{
			ans(wt);
		System.out.println("ans = "+n);
		}
		else
		{
			System.out.println("input must be 1 to 250 ");
		}
		System.out.println("do you wanna Enter weight again if yes press 1 ");
		again = in.nextInt();
		n=0;
		 }while(again==1);
		
		
	}

}
