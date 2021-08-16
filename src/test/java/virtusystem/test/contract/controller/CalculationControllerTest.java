package virtusystem.test.contract.controller;

import org.junit.jupiter.api.Test;
import virtusystem.test.contract.XMLParser;
import virtusystem.test.contract.model.CalculationDTO;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class CalculationControllerTest {

    public  String getTypeCoefficient(String type){
        if(type.equals("Квартира")){
            return "Apartment";
        }
        if (type.equals("Дом")){
            return "House";
        }
        if (type.equals("Комната")){
            return "Room";
        }
        return null;
    }
    public String getConstructionCoefficient(String year) {
        int convertYear = Integer.parseInt(year);
        if (convertYear < 2000) {
            return "BeforeThen2000"  ;
        }
        if ((convertYear==2015) || (convertYear>2015)){
            return "After2014";
        }
        else{
            return "Between2000And2014";
        }
    }
    public String getSquareCoefficient(String square){
        double convertSquare = Double.parseDouble(square);
        if (convertSquare<50.0){
            return "LessThen50";
        }
        if(convertSquare>100.0){
            return "Between50And100";
        }
        else {
            return "MoreThen100";
        }
    }
    @Test
    void prizeCalculation() {
        CalculationDTO calculationDTO = new CalculationDTO(10000,
                Date.valueOf("2010-03-22"),Date.valueOf("2010-03-24"),"Дом","2015","40");
        XMLParser xmlParser = new XMLParser();
        double typeCoef = xmlParser.XmlParserToFindACoefficient(getTypeCoefficient(calculationDTO.getTypeOfRealEstate()));
        double yearCoef = xmlParser.XmlParserToFindACoefficient(getConstructionCoefficient(calculationDTO.getYearOfConstruction()));
        double squareCoef = xmlParser.XmlParserToFindACoefficient(getSquareCoefficient(calculationDTO.getSquare()));
        String getPrize = Double.toString ((double) (calculationDTO.getSumInsured() / ((calculationDTO.getEndOfContract().getTime() -
                calculationDTO.getBeginningOfContract().getTime()) / (24 * 60 * 60 * 1000))) * typeCoef *
                yearCoef * squareCoef);
        String expectedPrize = "18000.0";
        assertEquals(expectedPrize,getPrize);
    }
}