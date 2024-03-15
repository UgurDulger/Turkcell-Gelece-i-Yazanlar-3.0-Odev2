package Entities;

import java.util.Date;

public class StarbucksCustomer extends Customer{
    private int StarCount ;

    public StarbucksCustomer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId, int starCount) {
        super(id, firstName, lastName, dateOfBirth, nationalityId);
        StarCount = starCount;
    }

    public StarbucksCustomer(int starCount) {
        StarCount = starCount;
    }
    public StarbucksCustomer(){

    }

    public int getStarCount() {
        return StarCount;
    }

    public void setStarCount(int starCount) {
        StarCount = starCount;
    }
}
