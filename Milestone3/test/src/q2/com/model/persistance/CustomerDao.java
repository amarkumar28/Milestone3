package q2.com.model.persistance;

public interface CustomerDao {
	void addCostumer(Customer c);
	Customer getById(int id);
}
