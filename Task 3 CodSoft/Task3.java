import java.util.Scanner;


 class ATM{

    private BankAccounts useraccount;

    private Scanner user= new Scanner(System.in);

    public ATM(BankAccounts useraccount){
        this.useraccount= useraccount;
    }


    public void work(){

        int choice;

        do{
              display_option();
              System.out.println("Enter your choice:");

              choice= user.nextInt();

              switch(choice){

                case 1:
                withdraw();
                break;

                case 2:
                deposit();
                break;

                case 3:
                checkbalance();
                break;

                default:
                System.out.println("Invalid choice. Please enter a valid choice");
              }
        }while(choice!=3);

        user.close();
    }

    


    public void display_option(){

        System.out.println("This is a ATM interface");
        System.out.println("Select the following options according that you want");
        System.out.println("Withdraw: 1");
        System.out.println("Deposit: 2");
        System.out.println("Checking Balance: 3");

    }


    private void checkbalance(){

        System.out.println("Your current balance is:"+useraccount.getbalance());
    }

    private void withdraw(){

        System.out.println("Enter the amount to withdraw:");
        double useramount= user.nextDouble();
        if(useraccount.withdraw(useramount)){
        System.out.println("Withdraw successful. Please collect your money. Available balance:"+useraccount.getbalance());
    }
}

    private void deposit(){

        System.out.println("Enter the amount to deposit");
        double useramount= user.nextDouble();
        useraccount.deposit(useramount);
        System.out.println("Money deposited successfully. Available balance:"+useraccount.getbalance());
    }
}



class BankAccounts{

    private double balanceamount;

    public BankAccounts(double previousbalanceamount){
        this.balanceamount = previousbalanceamount;
    }

    public double getbalance(){
       return balanceamount;
    }


public void deposit(double useramount){
if(useramount>0){
    balanceamount+=useramount;
System.out.print("Money deposited:"+useramount);
}
else{
    System.out.println("Invalid deposit amount");
}
}

public boolean withdraw(double useramount){
    if(useramount>0 && useramount<=balanceamount){
        balanceamount-=useramount;
        System.out.println("Amount withdrawn:"+useramount);
        return true;
    }
    else{
        System.out.println("Invalid amount");
        return false;
    }
  }
}

public class Task3{

    public static void main(String []args){

        BankAccounts useraccount= new BankAccounts(5000);

        ATM a1= new ATM(useraccount);
        a1.work();
    }
}
    




   