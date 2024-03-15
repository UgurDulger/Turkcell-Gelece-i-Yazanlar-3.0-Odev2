package Entities;

import java.util.Date;

public class NeroCustomer extends Customer{
    public NeroCustomer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
        super(id, firstName, lastName, dateOfBirth, nationalityId);
    }

    public NeroCustomer() {
    }
}
