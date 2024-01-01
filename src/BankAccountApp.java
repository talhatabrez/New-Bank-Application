package src;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<account> accounts = new LinkedList<account>();
        String file = "D:\\Work\\NewBankAccounts.csv";

        //read a csv file and create new account based on that data
        List<String[]> newAccountHolders = Utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            System.out.println("New Accounts: \n");
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + SSN + " " + accountType + " Rs." +initDeposit);
            if(accountType.equals("Savings")){
                System.out.println("Open a Savings Account");
                accounts.add(new savings(name, SSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                System.out.println("Open a Checkings account");
                accounts.add(new checking(name, SSN, initDeposit));
            }
            else{
                System.out.println("Error reading the account");
            }
        }
        
        for(account acc: accounts){
            System.out.println("\n----------------------");
            acc .showInfo();
            System.out.println("\n----------------------");
        }
    }
}
