package virtusystem.test.contract.domain.entity;

import liquibase.pro.packaged.C;

import javax.persistence.*;

@Entity
@Table(name="real_estate_address")
public class RealEstateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="state")
    private String state;

    @Column(name="index")
    private String index;

    @Column(name="region")
    private String region;

    @Column(name="area")
    private String area;

    @Column(name="locality")
    private String locality;

    @Column(name="street")
    private String street;

    @Column(name="house_number")
    private int houseNumber;

    @Column(name="frame")
    private String frame;

    @Column(name="apartment_number")
    private int apartmentNumber;

    @Column(name="comment")
    private String comment;

    public RealEstateEntity() {
    }

    public RealEstateEntity(int id, String state, String index, String region, String area, String locality,
                            String street, int houseNumber, String frame, int apartmentNumber, String comment) {
        this.id = id;
        this.state = state;
        this.index = index;
        this.region = region;
        this.area = area;
        this.locality = locality;
        this.street = street;
        this.houseNumber = houseNumber;
        this.frame = frame;
        this.apartmentNumber = apartmentNumber;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "RealEstateAddressEntity{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", index='" + index + '\'' +
                ", region='" + region + '\'' +
                ", area='" + area + '\'' +
                ", locality='" + locality + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", frame='" + frame + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                ", comment='" + comment + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

