package Object;

import java.time.LocalDate;
public class Claim {

    // Enum for claim status
    enum ClaimStatus {
        NEW,
        PROCESSING,
        DONE
    }
    private String claimID;
    private LocalDate claimDate;
    private LocalDate examDate;
    private double claimAmount;
    private ClaimStatus claimStatus;
    private DependentCustomer insuredPerson;
    private String cardNumber;
    private CustomerBankInfo bankInfo;

    // Constuctor
    public Claim(String claimID, LocalDate claimDate, LocalDate examDate,
                 double claimAmount, ClaimStatus claimStatus, DependentCustomer insuredPerson,
                 String cardNumber, CustomerBankInfo bankInfo){
        this.claimID = claimID;
        this.claimDate = claimDate;
        this.examDate = examDate;
        this.claimAmount = claimAmount;
        this.insuredPerson = insuredPerson;
        this.cardNumber = cardNumber;
        this.bankInfo = bankInfo;
    }

    // Getter
    public String getClaimID(){
        return this.claimID;
    }
}
