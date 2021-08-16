package virtusystem.test.contract.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import virtusystem.test.contract.domain.entity.CalculationEntity;

public interface CalculationRepository extends JpaRepository<CalculationEntity,Integer> {
}
