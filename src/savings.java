package src;

public class savings extends account {
    
    //list properties specific to savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //constructor to initialize the savings properties
    public savings(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountnumber = "1" + accountnumber;
        setSafetyDepositBox();
        setRate();
    }

    public void setRate(){
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }

    //list specific methods
    public void showInfo(){
        System.out.println("Account Type: Savings Account\n");
        super.showInfo();
        System.out.println(
            "Your account features: " +
            "\n Safety Deposit Box ID is: " +safetyDepositBoxID +
            "\n Safety Deposit Box Key is: " +safetyDepositBoxKey
        );
    }
}
