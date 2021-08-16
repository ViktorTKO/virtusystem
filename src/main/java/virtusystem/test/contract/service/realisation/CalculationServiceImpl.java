package virtusystem.test.contract.service.realisation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import virtusystem.test.contract.domain.entity.CalculationEntity;
import virtusystem.test.contract.domain.repository.CalculationRepository;
import virtusystem.test.contract.service.api.CalculationService;

import java.util.List;

@Service
@Transactional
public class CalculationServiceImpl implements CalculationService {

    @Autowired
    private CalculationRepository calculationRepository;

    @Override
    public CalculationEntity createCalculation(CalculationEntity calculationEntity) {
        return calculationRepository.save(calculationEntity);
    }

    @Override
    public CalculationEntity getCalculationById(int id) {

        return calculationRepository.getById(id);
    }

    @Override
    public void deleteCalculationById(int id) {
        calculationRepository.getById(id);
    }

    @Override
    public List<CalculationEntity> getAllCalculations() {
        return calculationRepository.findAll();
    }

    @Override
    public CalculationEntity updateCalculation(int id, CalculationEntity newCalculationEntity) {
        CalculationEntity calculationEntity = calculationRepository.getById(id);
        calculationEntity.setBeginningOfContract(newCalculationEntity.getBeginningOfContract());
        calculationEntity.setContractDate(newCalculationEntity.getContractDate());
        calculationEntity.setContractNumber(newCalculationEntity.getContractNumber());
        calculationEntity.setDateOfCalculation(newCalculationEntity.getDateOfCalculation());
        calculationEntity.setEndOfContract(newCalculationEntity.getEndOfContract());
        calculationEntity.setPrize(newCalculationEntity.getPrize());
        calculationEntity.setSquare(newCalculationEntity.getSquare());
        calculationEntity.setSumInsured(newCalculationEntity.getSumInsured());
        calculationEntity.setTypeOfRealEstate(newCalculationEntity.getTypeOfRealEstate());
        calculationEntity.setYearOfConstruction(newCalculationEntity.getYearOfConstruction());
        return calculationRepository.save(calculationEntity);
    }
}
