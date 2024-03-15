package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;
import Entities.StarbucksCustomer;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService {
    private ICustomerCheckService _ICustomerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
        _ICustomerCheckService = iCustomerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {
        if(_ICustomerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }
        else {
            System.out.println("Not Valid Person");
        }
    }

    public void addStar(Customer customer,int starcount){
        StarbucksCustomer customer1 = (StarbucksCustomer) customer;
        customer1.setStarCount(customer1.getStarCount() + starcount) ;
    }

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }
}
