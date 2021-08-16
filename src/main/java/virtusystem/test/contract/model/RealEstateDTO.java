package virtusystem.test.contract.model;


import virtusystem.test.contract.domain.entity.RealEstateEntity;

public class RealEstateDTO {
    private int id;
    private String state;
    private String index;
    private String region;
    private String area;
    private String locality;
    private String street;
    private int houseNumber;
    private String frame;
    private int apartmentNumber;
    private String comment;

    public RealEstateDTO() {
    }

    public RealEstateDTO(int id, String state, String index, String region, String area,
                         String locality, String street, int houseNumber, String frame,
                         int apartmentNumber, String comment) {
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

    public RealEstateDTO convertRealEstateEntityToRealEstateDTO(RealEstateEntity realEstateEntity){
        return  new RealEstateDTO(
                realEstateEntity.getId(),
                realEstateEntity.getState(),
                realEstateEntity.getIndex(),
                realEstateEntity.getRegion(),
                realEstateEntity.getArea(),
                realEstateEntity.getLocality(),
                realEstateEntity.getStreet(),
                realEstateEntity.getHouseNumber(),
                realEstateEntity.getFrame(),
                realEstateEntity.getApartmentNumber(),
                realEstateEntity.getComment()
        );
    }

    public RealEstateEntity convertRealEstateDTOToRealEstateEntity(RealEstateDTO realEstateDTO){
        return new RealEstateEntity(
                realEstateDTO.getId(),
                realEstateDTO.getState(),
                realEstateDTO.getIndex(),
                realEstateDTO.getRegion(),
                realEstateDTO.getArea(),
                realEstateDTO.getLocality(),
                realEstateDTO.getStreet(),
                realEstateDTO.getHouseNumber(),
                realEstateDTO.getFrame(),
                realEstateDTO.getApartmentNumber(),
                realEstateDTO.getComment()
        );
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
