package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
    public void addStar(Customer customer, int starCount) {}

    @Override
    public void Save(Customer customer) throws Exception {

        System.out.println("Saved to db : " + customer.getFirstName());
    }
}
