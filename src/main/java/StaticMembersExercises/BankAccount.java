package StaticMembersExercises;

public class BankAccount {
    private String accountNumber;
    private double balance;

    private static String bankName;
    private static double interestRate;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void displayAccountInfo(){
        System.out.println("Bank name: " + bankName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rates: " + interestRate);
    }


    public static void main(String[] args) {
        BankAccount.setBankName("Mysto Bank");
        BankAccount.setInterestRate(2.37);

        BankAccount acc1 = new BankAccount("Deol01", 2000);
        BankAccount acc2 = new BankAccount("Axoe23", 1430);
        BankAccount acc3 = new BankAccount("Ctrl13", 3700);

        acc1.displayAccountInfo();
        System.out.println("----------------------");
        acc2.displayAccountInfo();
        System.out.println("----------------------");
        acc3.displayAccountInfo();
    }
}
