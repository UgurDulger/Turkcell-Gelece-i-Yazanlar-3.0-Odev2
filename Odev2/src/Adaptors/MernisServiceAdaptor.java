package Adaptors;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import Mernis2.CTBKPSPublicSoap;

public class MernisServiceAdaptor implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        CTBKPSPublicSoap client = new CTBKPSPublicSoap();

        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear()+1900 );
    }
}
