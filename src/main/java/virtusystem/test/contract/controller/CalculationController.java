package virtusystem.test.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import virtusystem.test.contract.XMLParser;
import virtusystem.test.contract.domain.entity.CalculationEntity;
import virtusystem.test.contract.model.CalculationDTO;
import virtusystem.test.contract.service.api.CalculationService;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/v1.0/calculation")
public class CalculationController {
    @Autowired
    private CalculationService calculationService;

    @GetMapping
    public ResponseEntity<List<CalculationDTO>> get() {
        List<CalculationEntity> listOfCalculations = calculationService.getAllCalculations();
        List<CalculationDTO> listOfCalculationDTO = new ArrayList<>();
        for (CalculationEntity entity : listOfCalculations
        ) {
            listOfCalculationDTO.add(new CalculationDTO().convertCalculationEntityToDTO(entity));
        }
        return ResponseEntity.ok(listOfCalculationDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CalculationDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(new CalculationDTO().convertCalculationEntityToDTO(calculationService.getCalculationById(id)));
    }

    @PostMapping(value = "/post")
    public ResponseEntity<CalculationDTO> create(@RequestBody CalculationDTO calculationDTO) {
        CalculationDTO oldCalculationDTO = new CalculationDTO();
        CalculationDTO newCalculationDTO = oldCalculationDTO.convertCalculationEntityToDTO(calculationService.createCalculation(
                oldCalculationDTO.convertCalculationDTOToCalculationEntity(calculationDTO)
        ));
        return ResponseEntity.ok(newCalculationDTO);
    }

    @PutMapping(value = "/{id}")
    ResponseEntity<CalculationDTO> edit(@PathVariable int id, CalculationDTO calculationDTO) {
        CalculationDTO oldCalculationDTO = new CalculationDTO();
        CalculationDTO updateCalculationDTO = oldCalculationDTO.convertCalculationEntityToDTO(calculationService.updateCalculation(
                id, oldCalculationDTO.convertCalculationDTOToCalculationEntity(calculationDTO)));
        return ResponseEntity.ok(updateCalculationDTO);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        calculationService.deleteCalculationById(id);
        return ResponseEntity.ok("delete calculation with id=" + id);
    }

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
    @GetMapping("/prize")
    public ResponseEntity<String> prizeCalculation(@RequestBody CalculationDTO calculationDTO) {
        XMLParser xmlParser = new XMLParser();
        double typeCoef = xmlParser.XmlParserToFindACoefficient(getTypeCoefficient(calculationDTO.getTypeOfRealEstate()));
        double yearCoef = xmlParser.XmlParserToFindACoefficient(getConstructionCoefficient(calculationDTO.getYearOfConstruction()));
        double squareCoef = xmlParser.XmlParserToFindACoefficient(getSquareCoefficient(calculationDTO.getSquare()));

        String prize =Double.toString ((double) (calculationDTO.getSumInsured() / ((calculationDTO.getEndOfContract().getTime() -
                calculationDTO.getBeginningOfContract().getTime()) / (24 * 60 * 60 * 1000))) * typeCoef *
                yearCoef * squareCoef);
        return ResponseEntity.ok(prize);
    }

}
