import java.util.Scanner;
public class DitNumber{
    public static void main(String[] args){
        int m, n, sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer");
        m = s.nextInt();

        while(m >0){
            n = m % 10;
            sum = sum + n;
            m = m / 10;
            System.out.println("Sum is " + sum);
        }
    }

    // code hii swali lake lipo kwenye paper tulkua tukisoma jana nmekutumia whatsapp lkn nami nmeandka
}