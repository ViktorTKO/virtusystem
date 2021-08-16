package virtusystem.test.contract.service.api;

import virtusystem.test.contract.domain.entity.InsuredEntity;

import java.util.List;

public interface InsuredService {

    InsuredEntity createInsured(InsuredEntity insuredEntity);

    InsuredEntity getInsuredById(int id);

    void deleteInsuredById(int id);

    List<InsuredEntity> getAllInsureds();

    InsuredEntity updateInsured(int id, InsuredEntity insuredEntity);
}
