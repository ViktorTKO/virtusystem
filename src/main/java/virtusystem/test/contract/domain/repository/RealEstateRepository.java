package virtusystem.test.contract.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import virtusystem.test.contract.domain.entity.RealEstateEntity;

public interface RealEstateRepository extends JpaRepository<RealEstateEntity, Integer> {
}
