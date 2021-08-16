package virtusystem.test.contract.service.realisation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import virtusystem.test.contract.domain.entity.InsuredEntity;
import virtusystem.test.contract.domain.repository.InsuredRepository;
import virtusystem.test.contract.service.api.InsuredService;

import java.util.List;

@Service
@Transactional
public class InsuredServiceImpl implements InsuredService {

    @Autowired
    private InsuredRepository insuredRepository;

    @Override
    public InsuredEntity createInsured(InsuredEntity insuredEntity) {
        return insuredRepository.save(insuredEntity);
    }

    @Override
    public InsuredEntity getInsuredById(int id) {
        return insuredRepository.getById(id);
    }

    @Override
    public void deleteInsuredById(int id) {
        insuredRepository.deleteById(id);
    }

    @Override
    public List<InsuredEntity> getAllInsureds() {
        return insuredRepository.findAll();
    }

    @Override
    public InsuredEntity updateInsured(int id, InsuredEntity newInsuredEntity) {
        InsuredEntity insuredEntity = insuredRepository.getById(id);
        insuredEntity.setName(newInsuredEntity.getName());
        insuredEntity.setSurname(newInsuredEntity.getSurname());
        insuredEntity.setPatronymic(newInsuredEntity.getPatronymic());
        insuredEntity.setBirthDate(newInsuredEntity.getBirthDate());
        insuredEntity.setPassportSeries(newInsuredEntity.getPassportSeries());
        insuredEntity.setPassportNumber(newInsuredEntity.getPassportNumber());
        return insuredRepository.save(insuredEntity);
    }
}
