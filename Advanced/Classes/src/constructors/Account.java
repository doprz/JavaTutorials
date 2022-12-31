package constructors;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // The constructor is called once when the object is created, and can be used to initialize the object with your own conditions
    public Account() {
        /*
            This is a special case for 'this'. In this case, this helps set default values when creating
                the object. You are essentially calling the constructor
                [Note]: This is optional, but useful if you want to declare default values when creating an object
            If you choose to do this. This statement has to be the first line called in the constructor
        */
        // this("00000000", 0.00, "Default Name", "defaultEmail@example.com", "1-800-8000");
        System.out.println("Empty constructor for Account called");
    }

    // Overloading the constructor
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is: $" + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) { // Check if you have enough money
            System.out.println("Only $" + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance is: $" + this.balance);
        }
    }

    /*
        Creating getters and setters is so common that IntelliJ allows for automatic generation of them

        Go to Code > Generate > Getters and Setters and select the variables/fields that you want to generate them for
    */

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
