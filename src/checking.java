package src;

public class checking extends account {
    
    //list properties about the things displayed in readme
    private int debitCardNumber;
    private int debitPIN;
    
    //constructor to initialize checking account properties
    public checking(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountnumber = "2" + accountnumber;
        setDebitCard();
    }

    public void setRate(){
        rate = getBaseRate() *.15;
     }

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12)); 
        debitPIN = (int) (Math.random() * Math.pow(10, 4));
        
    }
    
    //list any methods specific to checking account
    public void showInfo(){
        System.out.println("Account Type: Checkings Account\n");
        super.showInfo();
        System.out.println("Your account features:"
        +"\n Debit Card Number: " +debitCardNumber+
        ("\n Debit Card Pin: "+debitPIN));
    }
}
