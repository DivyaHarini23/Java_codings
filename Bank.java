
import java.util.*;
public class Bank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BankAccount b= new BankAccount(1,"Abi", 25,"savings");

        while (true) { 
            System.out.println("Welcome to Bank Application");
            System.out.println("1 -> Get Details");
            System.out.println("2 -> Deposit");
            System.out.println("3 -> Withdrawal");
            System.out.println("4->Get Balance");
            System.out.println("5 ->Exit");

            System.out.print("Enter your choice");
            int choice=sc.nextInt();

            if(choice == 1){
                    b.getDetails();
            }
            else if(choice == 2){
                System.out.println("Enter the amount to deposit");
                int amount=sc.nextInt();
                b.deposit(amount);
            }
            else if(choice ==3 ){
                System.out.println("Enter the amount to withdrawal");
                int amount=sc.nextInt();
                b.withdrawal(amount);
            }
            else if(choice == 4){
                b.getBalance();
            }
            else if(choice== 5){
                System.out.println("Thank you for visiting");
                break;
            }
            else{
                System.out.println("Invalid option");
            }
        }
    }
}

class BankAccount{
    int id;
    String name;
    int age;
    String accountType;
    double balance=0.0;
//parameterized constructor
    public BankAccount(int id, String name, int age, String accountType){
        this.id= id;
        this.name= name;
        this.age= age;
        this.accountType= accountType;
    }

    public void getDetails(){
        System.out.println("Name:"+this.name+"Id" +this.id+"Age"+ this.age+"Account Type"+this.accountType);
    }

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Rs. "+amount+"was deposited successfully");

    }
    public void withdrawal(int amount){
        if(this.balance>=amount){
            balance-= amount;
            System.out.println("Rs."+ amount + " was debited successfully");
        }
        else{
            System.out.println("insufficient amount");
        }

    }
    public void getBalance(){
        System.out.println("This is your balance"+ this.balance);
    }
}