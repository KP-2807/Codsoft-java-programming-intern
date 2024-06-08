import java.util.Scanner;
public class codsoftATM {
    public static void main(String[] atm){

        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println( "\n ATM Service\n"+
                    "1.Withdraw amount\n" +
                    "2.Deposit amount\n" +
                    "3.Check Bank Balance\n" +
                    "4.Exit\n"+ "Choose an option: " );
            int option = scan.nextInt();
            UserBankAccountImpl obj = new UserBankAccountImpl();

            switch (option) {
                case 1:
                    System.out.println( "" + obj.withDraw());
                    break;
                case 2:
                    System.out.println("" + obj.deposit());
                    break;
                case 3:
                    System.out.println("Your Balance: " + obj.checkBalance());
                    break;
                case 4:
                    System.out.println("Exiting");


                default:
                    System.out.println("Unexpected value: " + option);
                    break;
            }
            if(option>=4){
                break;
            }

        }
    }

}
