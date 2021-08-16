package virtusystem.test.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import virtusystem.test.contract.domain.entity.CalculationEntity;
import virtusystem.test.contract.domain.entity.InsuredEntity;
import virtusystem.test.contract.model.CalculationDTO;
import virtusystem.test.contract.model.InsuredDTO;
import virtusystem.test.contract.service.api.InsuredService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0/insureds")
public class InsuredController {
    @Autowired
    private InsuredService insuredService;

    @GetMapping
    public ResponseEntity<List<InsuredDTO>> get() {
        List<InsuredEntity> listOfInsureds = insuredService.getAllInsureds();
        List<InsuredDTO> listOfInsuredDTO = new ArrayList<>();
        for (InsuredEntity entity : listOfInsureds
        ) {
            listOfInsuredDTO.add(new InsuredDTO().convertInsuredEntityToInsuredDTO(entity));
        }
        return ResponseEntity.ok(listOfInsuredDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<InsuredDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(new InsuredDTO().convertInsuredEntityToInsuredDTO(insuredService.getInsuredById(id)));
    }

    @PostMapping(value = "/post")
    public ResponseEntity<InsuredDTO> create(@RequestBody InsuredDTO insuredDTO) {
        InsuredDTO oldInsuredDTO = new InsuredDTO();
        InsuredDTO newInsuredDTO = oldInsuredDTO.convertInsuredEntityToInsuredDTO(insuredService.createInsured(
                oldInsuredDTO.convertInsuredDTOToInsuredEntity(insuredDTO)
        ));
        return ResponseEntity.ok(newInsuredDTO);
    }

    @PutMapping(value = "/{id}")
    ResponseEntity<InsuredDTO> edit(@PathVariable int id, InsuredDTO insuredDTO){
        InsuredDTO oldInsuredDTO = new InsuredDTO();
        InsuredDTO updateInsuredDTO = oldInsuredDTO.convertInsuredEntityToInsuredDTO(insuredService.updateInsured(
                id,oldInsuredDTO.convertInsuredDTOToInsuredEntity(insuredDTO)));
        return ResponseEntity.ok(updateInsuredDTO);
    }

    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
         insuredService.deleteInsuredById(id);
        return ResponseEntity.ok("delete calculation with id=" + id);
    }
}
