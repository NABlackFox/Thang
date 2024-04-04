package Object;

public class CustomerBankInfo {
    private String bankAccountNumber;
    private String bankName;
    private String customerID;
    private String customerName;

    public CustomerBankInfo(String bankAccountNumber, String bankName, String customerID, String customerName){
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
        this.customerID = customerID;
        this.customerName = customerName;
    }
}
