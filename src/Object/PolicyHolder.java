package Object;

import java.util.ArrayList;

public class PolicyHolder extends Customer{
    private ArrayList<DependentCustomer> dependentCustomerList;

    // Constructor
    public PolicyHolder(){
        super();
        this.dependentCustomerList = new ArrayList<>();
    }

    public PolicyHolder(String customerID, String customerFullName, InsuranceCard customerInsuranceCard){
        super(customerID, customerFullName, customerInsuranceCard);
        this.dependentCustomerList = new ArrayList<>();
    }
}
