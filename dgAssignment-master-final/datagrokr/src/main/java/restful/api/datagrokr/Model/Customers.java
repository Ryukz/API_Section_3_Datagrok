package restful.api.datagrokr.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Customers {
@Id
@Column(columnDefinition = "integer default 1")
private Integer CustomerID;
@NotNull(message = "Value can not be null")
@Column(columnDefinition = "varchar(40)")
private String CompanyName;
    @Column(columnDefinition = "varchar(30)")
private String ContactName;
    @Column(columnDefinition = "varchar(30)")
private String ContactTitle;
    @Column(columnDefinition = "varchar(60)")
private String Address;
    @Column(columnDefinition = "varchar(15)")
private String City;
    @Column(columnDefinition = "varchar(15)")
private String Region;
    @Column(columnDefinition = "varchar(10)")
private String PostalCode;
    @Column(columnDefinition = "varchar(15)")
private String Country;
    @Column(columnDefinition = "varchar(24)")
private String Phone;
    @Column(columnDefinition = "varchar(24)")
private String Fax;


    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer customerID) {
        CustomerID = customerID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }



    @Override
    public String toString() {
        return "Customers{" +
                "CustomerID='" + CustomerID + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", ContactName='" + ContactName + '\'' +
                ", ContactTitle='" + ContactTitle + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Region='" + Region + '\'' +
                ", PostalCode='" + PostalCode + '\'' +
                ", Country='" + Country + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Fax='" + Fax + '\'' +
                '}';
    }
}
