package Object;

import java.util.ArrayList;

public abstract class Customer {
    private String customerID;
    private String customerFullName;
    private InsuranceCard customerInsuranceCard;
    private ArrayList<Claim> claimList;


    // Constructor
    public Customer(String customerID, String customerFullName, InsuranceCard customerInsuranceCard){
        this.customerID = customerID;
        this.customerFullName = customerFullName;
        this.customerInsuranceCard = customerInsuranceCard;
        this.claimList = new ArrayList<Claim>();
    }

    public Customer(){
        this.customerID = "";
        this.customerFullName = "";
        this.customerInsuranceCard = null;
        this.claimList = new ArrayList<Claim>();
    }
}
