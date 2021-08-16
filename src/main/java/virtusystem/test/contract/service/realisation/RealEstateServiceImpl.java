package virtusystem.test.contract.service.realisation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import virtusystem.test.contract.domain.entity.RealEstateEntity;
import virtusystem.test.contract.domain.repository.RealEstateRepository;
import virtusystem.test.contract.service.api.RealEstateService;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class RealEstateServiceImpl implements RealEstateService {

    @Autowired
    private RealEstateRepository realEstateRepository;

    @Override
    public RealEstateEntity createRealEstate(RealEstateEntity realEstateEntity) {
        return realEstateRepository.save(realEstateEntity);
    }

    @Override
    public RealEstateEntity getRealEstateById(int id) {
        return realEstateRepository.getById(id);
    }

    @Override
    public void deleteRealEstateById(int id) {
         realEstateRepository.deleteById(id);
    }

    @Override
    public List<RealEstateEntity> getAllRealEstates() {
        return realEstateRepository.findAll();
    }

    @Override
    public RealEstateEntity updateRealEstate(int id, RealEstateEntity newRealEstateEntity) {
       RealEstateEntity realEstateEntity = realEstateRepository.getById(id);
       realEstateEntity.setApartmentNumber(newRealEstateEntity.getApartmentNumber());
       realEstateEntity.setArea(newRealEstateEntity.getArea());
       realEstateEntity.setFrame(newRealEstateEntity.getFrame());
       realEstateEntity.setHouseNumber(newRealEstateEntity.getHouseNumber());
       realEstateEntity.setIndex(newRealEstateEntity.getIndex());
       realEstateEntity.setLocality(newRealEstateEntity.getLocality());
       realEstateEntity.setRegion(newRealEstateEntity.getRegion());
       realEstateEntity.setState(newRealEstateEntity.getState());
       realEstateEntity.setState(newRealEstateEntity.getStreet());
       realEstateEntity.setComment(newRealEstateEntity.getComment());
       return  realEstateRepository.save(realEstateEntity);
    }
}
