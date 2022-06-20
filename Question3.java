import java.util.Scanner;
	public class Question3{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
	int peak;
	int dpeak;
	int weekend;
	int dweekend;
	int amount=10000;
	int  extraamount;
	System.out.print("enter minutes for peak: ");
	peak=input.nextInt();
	
	System.out.print("enter minutes for weekend: ");
	weekend=input.nextInt();
	
	if (peak<=400 && weekend<=750)
	{
	System.out.println("amount is " +amount);
	}
	else if(peak>400 && weekend>750){
	 
		dpeak= peak-400 ;
		dweekend=weekend-750;
		
		extraamount= ((dpeak + dweekend)*150 ) +10000;
		System.out.println("extraamount is " +extraamount);
		}
		
	else if(peak>400){
	 
		dpeak= peak-400 ;
		
		extraamount= (dpeak*150 ) +10000;
		System.out.println("extraamount is " +extraamount);
		}
		
	else{
		dweekend=weekend-750;
		
		extraamount= (dweekend*150 ) +10000;
		System.out.println("extraamount is " +extraamount);
		}
	}
}
