package Object;

import java.time.LocalDate;
import java.time.LocalTime;
public class InsuranceCard {
    private String cardID;
    private DependentCustomer cardHolder;
    private PolicyHolder policyHolder;
    private LocalDate expirationDate;

    public InsuranceCard(String cardID, DependentCustomer cardHolder, PolicyHolder policyHolder, LocalDate expirationDate){
        this.cardID = cardID;
        this.cardHolder = cardHolder;
        this.policyHolder = policyHolder;
        this.expirationDate = expirationDate;
    }
}
