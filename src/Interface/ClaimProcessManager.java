package Interface;
import Object.Claim;
public interface ClaimProcessManager {
    public boolean add(Claim claim);
    public boolean update(String claimID);
    public boolean delete(String claimID);
    public boolean getOne();
    public boolean getAll();
}
