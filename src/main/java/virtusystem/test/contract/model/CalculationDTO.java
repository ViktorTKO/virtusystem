package virtusystem.test.contract.model;


import virtusystem.test.contract.domain.entity.CalculationEntity;

import java.sql.Date;

public class CalculationDTO {

    private int id;
    private int sumInsured;
    private Date beginningOfContract;
    private Date endOfContract;
    private String typeOfRealEstate;
    private String yearOfConstruction;
    private String square;
    private Date dateOfCalculation;
    private String prize;
    private int contractNumber;
    private Date contractDate;

    public CalculationDTO() {
    }

    public CalculationDTO(int sumInsured, Date beginningOfContract, Date endOfContract,
                          String typeOfRealEstate, String yearOfConstruction, String square) {
        this.sumInsured = sumInsured;
        this.beginningOfContract = beginningOfContract;
        this.endOfContract = endOfContract;
        this.typeOfRealEstate = typeOfRealEstate;
        this.yearOfConstruction = yearOfConstruction;
        this.square = square;
    }

    public CalculationDTO(int id, int sumInsured, Date beginningOfContract,
                          Date endOfContract, String typeOfRealEstate, String yearOfConstruction,
                          String square, Date dateOfCalculation, String prize, int contractNumber, Date contractDate) {
        this.id = id;
        this.sumInsured = sumInsured;
        this.beginningOfContract = beginningOfContract;
        this.endOfContract = endOfContract;
        this.typeOfRealEstate = typeOfRealEstate;
        this.yearOfConstruction = yearOfConstruction;
        this.square = square;
        this.dateOfCalculation = dateOfCalculation;
        this.prize = prize;
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(int sumInsured) {
        this.sumInsured = sumInsured;
    }

    public Date getBeginningOfContract() {
        return beginningOfContract;
    }

    public void setBeginningOfContract(Date beginningOfContract) {
        this.beginningOfContract = beginningOfContract;
    }

    public Date getEndOfContract() {
        return endOfContract;
    }

    public void setEndOfContract(Date endOfContract) {
        this.endOfContract = endOfContract;
    }

    public String getTypeOfRealEstate() {
        return typeOfRealEstate;
    }

    public void setTypeOfRealEstate(String typeOfRealEstate) {
        this.typeOfRealEstate = typeOfRealEstate;
    }

    public String getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(String yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public Date getDateOfCalculation() {
        return dateOfCalculation;
    }

    public void setDateOfCalculation(Date dateOfCalculation) {
        this.dateOfCalculation = dateOfCalculation;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public CalculationDTO convertCalculationEntityToDTO(CalculationEntity calculationEntity){
        return new CalculationDTO(
                calculationEntity.getId(),
                calculationEntity.getSumInsured(),
                calculationEntity.getBeginningOfContract(),
                calculationEntity.getEndOfContract(),
                calculationEntity.getTypeOfRealEstate(),
                calculationEntity.getYearOfConstruction(),
                calculationEntity.getSquare(),
                calculationEntity.getDateOfCalculation(),
                calculationEntity.getPrize(),
                calculationEntity.getContractNumber(),
                calculationEntity.getContractDate()
        );
    }
    public CalculationEntity convertCalculationDTOToCalculationEntity(CalculationDTO calculationDTO){
        return  new CalculationEntity(
                calculationDTO.getId(),
                calculationDTO.getSumInsured(),
                calculationDTO.getBeginningOfContract(),
                calculationDTO.getEndOfContract(),
                calculationDTO.getTypeOfRealEstate(),
                calculationDTO.getYearOfConstruction(),
                calculationDTO.getSquare(),
                calculationDTO.getDateOfCalculation(),
                calculationDTO.getPrize(),
                calculationDTO.getContractNumber(),
                calculationDTO.getContractDate()
        );
    }
}
