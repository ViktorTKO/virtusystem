package virtusystem.test.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import virtusystem.test.contract.domain.entity.CalculationEntity;
import virtusystem.test.contract.domain.entity.InsuredEntity;
import virtusystem.test.contract.model.CalculationDTO;
import virtusystem.test.contract.model.InsuredDTO;
import virtusystem.test.contract.service.api.InsuredService;

@Controller
public class HomeController {

    @Autowired
    private InsuredService insuredService;
    @RequestMapping(value="/home")
    public String home(Model theModel){
        InsuredDTO insuredDTO = new InsuredDTO().convertInsuredEntityToInsuredDTO(insuredService.getInsuredById(1));
        theModel.addAttribute("insured",insuredDTO);
        return "index";
    }
    @RequestMapping(value="/calc")
    public String calc(Model theModel){
        CalculationDTO calculationDTO = new CalculationDTO();
        theModel.addAttribute("calculation",calculationDTO);
        return "contract-create";
    }
}
