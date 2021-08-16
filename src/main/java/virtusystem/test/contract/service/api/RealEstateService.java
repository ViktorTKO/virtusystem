package virtusystem.test.contract.service.api;

import virtusystem.test.contract.domain.entity.InsuredEntity;
import virtusystem.test.contract.domain.entity.RealEstateEntity;

import java.util.List;

public interface RealEstateService {
    RealEstateEntity createRealEstate(RealEstateEntity realEstateEntity);

    RealEstateEntity getRealEstateById(int id);

    void deleteRealEstateById(int id);

    List<RealEstateEntity> getAllRealEstates();

    RealEstateEntity updateRealEstate(int id, RealEstateEntity realEstateEntity);
}
