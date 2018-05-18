package pl.sda.poznan.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CustomerDemographics")
public class CustomerDemographics {
    private Integer customerDemographicId;
    private String customerDesc;
    private Set<Customer> customers = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "OrderDetailsId")
    public Integer getCustomerDemographicId() {
        return customerDemographicId;
    }

    public void setCustomerDemographicId(Integer customerDemographicId) {
        this.customerDemographicId = customerDemographicId;
    }

    @Column(name= "CustomerDesc")
    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc;
    }

    @ManyToMany(mappedBy = "customerDemographics")
    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
