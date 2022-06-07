import java.util.Scanner;
public class Task_three{
    public static void main(String [] args){
        int number = 0, sum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: \n");

        do{
            number = input.nextInt();
            if(number != 5){
                if(number >=0){
                    sum = number + sum;
                }
            }
            
            System.out.printf("%d", sum);
        }
        while(number > 0);
    }
}