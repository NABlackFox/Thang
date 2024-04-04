package Object;

public class DependentCustomer extends Customer{

    // Constructor
    public DependentCustomer(){
        super();
    }
    public DependentCustomer(String customerID, String customerFullName, InsuranceCard customerInsuranceCard){
        super(customerID, customerFullName, customerInsuranceCard);
    }
}
