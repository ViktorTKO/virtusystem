package virtusystem.test.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import virtusystem.test.contract.domain.entity.InsuredEntity;
import virtusystem.test.contract.domain.entity.RealEstateEntity;
import virtusystem.test.contract.model.InsuredDTO;
import virtusystem.test.contract.model.RealEstateDTO;
import virtusystem.test.contract.service.api.RealEstateService;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1.0/realEstates")
public class RealEstateController {
    @Autowired
    private RealEstateService realEstateService;

    @GetMapping
    public ResponseEntity<List<RealEstateDTO>> get() {
        List<RealEstateEntity> listOfRealEstates = realEstateService.getAllRealEstates();
        List<RealEstateDTO> listOfRealEstateDTO = new ArrayList<>();
        for (RealEstateEntity entity : listOfRealEstates
        ) {
            listOfRealEstateDTO.add(new RealEstateDTO().convertRealEstateEntityToRealEstateDTO(entity));
        }
        return ResponseEntity.ok(listOfRealEstateDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RealEstateDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(new RealEstateDTO().convertRealEstateEntityToRealEstateDTO(realEstateService.getRealEstateById(id)));
    }

    @PostMapping(value = "/post")
    public ResponseEntity<RealEstateDTO> create(@RequestBody RealEstateDTO realEstateDTO) {
        RealEstateDTO oldRealEstateDTO = new RealEstateDTO();
        RealEstateDTO newRealEstateDTO = oldRealEstateDTO.convertRealEstateEntityToRealEstateDTO(realEstateService.createRealEstate(
                oldRealEstateDTO.convertRealEstateDTOToRealEstateEntity(realEstateDTO)
        ));
        return ResponseEntity.ok(newRealEstateDTO);
    }

    @PutMapping(value = "/{id}")
    ResponseEntity<RealEstateDTO> edit(@PathVariable int id, RealEstateDTO realEstateDTO){
        RealEstateDTO oldRealEstateDTO = new RealEstateDTO();
        RealEstateDTO updateRealEstateDTO = oldRealEstateDTO.convertRealEstateEntityToRealEstateDTO(realEstateService.updateRealEstate(
                id,oldRealEstateDTO.convertRealEstateDTOToRealEstateEntity(realEstateDTO)));
        return ResponseEntity.ok(updateRealEstateDTO);
    }

    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        realEstateService.deleteRealEstateById(id);
        return ResponseEntity.ok("delete calculation with id=" + id);
    }
}
