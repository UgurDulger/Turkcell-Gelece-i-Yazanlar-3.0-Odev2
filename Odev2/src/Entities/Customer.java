package Entities;

import Abstract.IEntity;

import java.util.Date;
public class Customer implements IEntity {
    private int Id;
    private String FirstName;
    private String LastName;
    private Date DateOfBirth;
    private String NationalityId;

    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
        this.Id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.DateOfBirth = dateOfBirth;
        this.NationalityId = nationalityId;
    }
    public Customer(){

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public java.lang.String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(java.lang.String nationalityId) {
        NationalityId = nationalityId;
    }
}
