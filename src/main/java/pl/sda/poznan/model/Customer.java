package pl.sda.poznan.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Customers")
public class Customer {
    private Integer customerId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;
    private Set<CustomerDemographics> customerDemographics = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "CustomerId")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Size(max = 40)
    @Column(name= "CompanyName")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Size(max = 30)
    @Column(name= "ContactName")
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Size(max = 30)
    @Column(name= "ContactTitle")
    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    @Size(max = 60)
    @Column(name= "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Size(max = 15)
    @Column(name= "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Size(max = 15)
    @Column(name= "Region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Size(max = 10)
    @Column(name= "PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Size(max = 15)
    @Column(name= "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Size(max = 24)
    @Column(name= "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Size(max = 24)
    @Column(name= "Fax")
    public String getFax() {
        return fax;
    }


    public void setFax(String fax) {
        this.fax = fax;
    }

    @ManyToMany
    @JoinTable(
            name = "CustDemo",
            joinColumns = {@JoinColumn(name = "customerId")},
            inverseJoinColumns = {@JoinColumn(name = "customerDemographicId")}
    )
    public Set<CustomerDemographics> getCustomerDemographics() {
        return customerDemographics;
    }

    public void setCustomerDemographics(Set<CustomerDemographics> customerDemographics) {
        this.customerDemographics = customerDemographics;
    }
}
