package pl.sda.poznan.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Territorries")
public class Territory {
    private Integer territoryId;
    private String territoryDescription;
    private Region region;
    private List<Employee> employees;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TerritoryID")
    public Integer getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Integer territoryId) {
        this.territoryId = territoryId;
    }

    @Column(name = "TerritoryDescription")
    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    @ManyToOne
    @PrimaryKeyJoinColumn
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @ManyToMany(mappedBy = "territories")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
