package virtusystem.test.contract.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import liquibase.pro.packaged.D;

import javax.persistence.*;
import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

@Entity
@Table(name="calculation")
public class CalculationEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="sum_insured")
    private int sumInsured;

    @Column(name="beginning_of_contract")
    private Date beginningOfContract;

    @Column(name="end_of_contract")
    private Date endOfContract;

    @Column(name="type_of_real_estate")
    private String typeOfRealEstate;

    @Column(name="year_of_construction")
    private String yearOfConstruction;

    @Column(name="square")
    private String square;

    @Column(name="date_of_calculation")
    private Date dateOfCalculation;

    @Column(name="prize")
    private String prize;

    @Column(name="contract_number")
    private int contractNumber;

    @Column(name="contract_date")
    private Date contractDate;

    public CalculationEntity() {
    }

    public CalculationEntity(int sumInsured, Date beginningOfContract, Date endOfContract,
                             String typeOfRealEstate, String yearOfConstruction, String square) {
        this.sumInsured = sumInsured;
        this.beginningOfContract = beginningOfContract;
        this.endOfContract = endOfContract;
        this.typeOfRealEstate = typeOfRealEstate;
        this.yearOfConstruction = yearOfConstruction;
        this.square = square;
    }

    public CalculationEntity(int id, int sumInsured, Date beginningOfContract,
                             Date endOfContract, String typeOfRealEstate, String yearOfConstruction, String square,
                             Date dateOfCalculation, String prize, int contractNumber, Date contractDate) {
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

    @Override
    public String toString() {
        return "CalculationEntity{" +
                "id=" + id +
                ", sumInsured=" + sumInsured +
                ", beginningOfContract=" + beginningOfContract +
                ", endOfContract=" + endOfContract +
                ", typeOfRealEstate='" + typeOfRealEstate + '\'' +
                ", yearOfConstruction='" + yearOfConstruction + '\'' +
                ", square='" + square + '\'' +
                ", dateOfCalculation=" + dateOfCalculation +
                ", prize='" + prize + '\'' +
                ", contractNumber=" + contractNumber +
                ", contractDate=" + contractDate +
                '}';
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
}
