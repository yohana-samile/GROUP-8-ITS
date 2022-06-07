public class SwitchInJava{
    public static void main(String [] args){
       int Days = 4;

        //    switch start
        switch(Days){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wensday");
            break;

            case 4:
            System.out.println("Alhamis");
            break;

            default:
                System.out.println("Out Of Range");
        }
    }
}