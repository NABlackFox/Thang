package Object;

import Interface.ClaimProcessManager;

import java.util.ArrayList;

public abstract class Customer implements ClaimProcessManager{
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

    @Override
    public boolean add(Claim claim) {
        if (this.claimList.add(claim)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(String claimID) {
        for (Claim claimTemp : this.claimList){
            if (claimTemp.getClaimID().equals(claimID)){
                // update
            }
        }
        return false;
    }

    @Override
    public boolean delete(String claimID) {
        for (Claim claimTemp : this.claimList){
            if (claimTemp.getClaimID().equals(claimID)){
                // delete
            }
        }
        return false;
    }

    @Override
    public boolean getOne() {
        return false;
    }

    @Override
    public boolean getAll() {
        return false;
    }
}
