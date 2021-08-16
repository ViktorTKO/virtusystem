package virtusystem.test.contract.service.api;

import org.springframework.context.annotation.Bean;
import virtusystem.test.contract.domain.entity.CalculationEntity;
import virtusystem.test.contract.domain.entity.InsuredEntity;

import java.util.List;

public interface CalculationService {

    CalculationEntity createCalculation(CalculationEntity calculationEntity);

    CalculationEntity getCalculationById(int id);

    void deleteCalculationById(int id);

    List<CalculationEntity> getAllCalculations();

    CalculationEntity updateCalculation(int id, CalculationEntity calculationEntity);

}
