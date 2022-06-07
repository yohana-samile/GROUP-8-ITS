import java.util.Scanner;
public class ProductOfNumber{
    public static void main(String [] args){
        // variable declaration
        int i, n, productOfNumber = 1;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Number To Find its Product\n");

        n = input.nextInt();

        for(i = 1; i <= n; i++){
            productOfNumber = productOfNumber * n;
            System.out.printf("* %d", i, n);
        }

        // output
        System.out.printf(" The product is %d", productOfNumber);
    }
    // swali hili lilihitaji kutafuta product ya namba ambapo user akiingza
    // number program itaanzia moja hadi kweny hiyo number kutafuta sum
    // mfano akiingza 4 itachukua 1 * 2 * 3 *4 na italeta sum na
    // itafanya hivyo hata kwa namba zengne atazo ingza
}