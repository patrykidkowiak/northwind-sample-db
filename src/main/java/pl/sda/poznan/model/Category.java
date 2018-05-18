package pl.sda.poznan.model;

import javax.persistence.*;

@Entity
@Table(name="Categories")
public class Category {
    private Integer categoryId;
    private String categoryName;
    private String desctiption;
    private Byte picture[];

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "CategoryId")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name= "CategoryName")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Column(name= "Description")
    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    @Column(name= "Picture")
    public Byte[] getPicture() {
        return picture;
    }

    public void setPicture(Byte[] picture) {
        this.picture = picture;
    }
}
