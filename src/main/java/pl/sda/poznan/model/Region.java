package pl.sda.poznan.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Regions")
public class Region {
    private Integer regionId;
    private String desctiption;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RegionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Column(name = "Description")
    @Size(max = 50)
    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }
}
