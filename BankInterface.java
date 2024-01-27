import java.util.Scanner;

public class BankInterface {
    public static void main(String[] args) {
        System.out.println("Enter initial balance : ");
        Scanner sc = new Scanner(System.in);
        int initial_amount=sc.nextInt();

        BankInterface_display scanner=new BankInterface_display(initial_amount);
        scanner.runATM();
        

    }
}

 class BankInterface_display {

int balance=0;

public BankInterface_display(int initial_amount) {
    this.balance=initial_amount;
   
}
 void deposit(int deposit_amt)
{
    balance=balance+deposit_amt;

}
void withDraw(int with_draw)
{
    balance=balance-with_draw;
}
void Balance(int balance)
{
    System.out.println("Balance is :"+this.balance);
}
void runATM()
{
    while (true) {
        System.out.println("----MENU----");
        System.out.println("1. withdraw");
        System.out.println("2. deposit");
        System.out.println("3. balance");
        System.out.println("4. exit");

        System.out.println("Enter your choice :");
        Scanner choice = new Scanner(System.in);
        int key= choice.nextInt();

    

    switch (key) {
        case 1:
            System.out.println("Enter withdraw amount : ");
            Scanner wt= new Scanner(System.in);
            int with_draw= wt.nextInt();

            withDraw(with_draw);

            if(with_draw>balance)
            {
                System.out.println("limit crossed");
            }
            else
            {
                System.out.println("withdraw successful");
            }
            break;
    
        case 2:
            System.out.println("Enter deposit amount :");
            Scanner dp= new Scanner(System.in);
            int deposit_amt=dp.nextInt();
             
            deposit(deposit_amt);
            break;
        case 3:
            Balance(balance);
            break;
        case 4:
            System.exit(0);

            

        
    }
}
}
//deposit
//withdraw
//display
//exit

    
}
