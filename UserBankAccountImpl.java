import java.util.Scanner;

public class UserBankAccountImpl{
    public static float AccountBalance = 60000;
    Scanner scan=new Scanner(System.in);
    public float withDraw(){
        System.out.println("Enter the amount to withdraw: ");
        int withdrawAmount=scan.nextInt();

        if(AccountBalance>withdrawAmount){
            AccountBalance-=withdrawAmount;
            System.out.println(withdrawAmount+" rupees have been Withdrawn");}
        else
            System.out.println("Insufficient Balance");
        return 0;
    }

    public float checkBalance() {

        return AccountBalance;
    }
    public float  deposit() {
        System.out.println("Enter the amount to depoist: ");
        int depositAmount=scan.nextInt();
        AccountBalance+=depositAmount;
        System.out.println(depositAmount+" rupees have been Deposited");
        return 0;
    }
}