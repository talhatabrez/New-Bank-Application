package src;

public abstract class account implements IBaseRate {
    
    //list common properties for savings and checking accounts
    private String name;
    private String SSN; //social security number
    private double balance;
    protected String accountnumber;
    protected double rate;
    private static int index = 10920;

    //constructor to set base properties
    public account(String name, String SSN, double initDeposit){
        this.name = name;
        this.SSN = SSN;
        balance = initDeposit;
        
        //set account number
        index++;
        this.accountnumber = setAccountNumber();
        System.out.println(getBaseRate());
        setRate();
        //System.out.println("Account Number: "+this.accountnumber);

    }

    public abstract void setRate();

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance +accruedInterest;
        System.out.println("Accrued Interest: Rs. " +accruedInterest);
        printBalance();
    }
    
    private String setAccountNumber(){
        String lastTwoOfSSN = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));  
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    //common methods as displayed
    public void showInfo(){
        System.out.println(
            "Name:" +name+
            "\nAccount Number: " +accountnumber+
            "\nBalance: " +balance+
            "\nRate: " +rate+ "%"
        );
    }

    public void deposit(double amount){
        balance = balance +amount;
        System.out.println("Depositing Rs. " +amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing Rs. " +amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring Rs." +amount + " to " +toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your account balance is Rs. " +balance);
    }
}
