import java.util.Scanner;

public class Main {
    static Scanner scanner  = new Scanner(System.in);
    public static void main(String [] args){

        // Banking Program
        double balance = 100.99;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("BANKING PROGRAM!------->");
            System.out.println("1. See Bank Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. EXIT!");

            System.out.print("Choose One Option: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> {
                    System.out.println("You Choose to see Balance---->");
                    bankBalance(balance);
                }
                case 2 -> {
                    System.out.println("You Choose to Withdraw---->");
                    balance = balance - withdraw(balance);
                }
                case 3 -> {
                    System.out.println("You Choose to Deposit---->");
                    balance = balance + deposit();
                }
                case 4 -> isRunning = false;
                default -> System.out.println("NOT AN OPTION!");
            }
            System.out.println("HAVE A NICE DAY!\n\n");
        }

        scanner.close();
    }
    static void bankBalance(double balance){
        System.out.printf("$ %.2f\n",balance);
    }
    static double withdraw(double balance){
        double withdraw;
        System.out.print("Enter the withdraw amount: ");
        withdraw = scanner.nextDouble();
        if(withdraw < 0){
            System.out.println("INVALID!");
            return 0;
        }
        else if(withdraw > balance){
            System.out.println("NOT HAVE ENOUGH MONEY!");
            return 0;
        }
        return withdraw;
    }
    static double deposit() {
        double deposit;
        System.out.print("Enter the deposit amount: ");
        deposit = scanner.nextDouble();
        if (deposit < 0) {
            System.out.println("INVALID!");
            return 0;
        }
        return deposit;
    }
}
