package densoft.springframework.sdjpainheritence.repositories;

import densoft.springframework.sdjpainheritence.domain.joined.ElectricGuitar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long> {
}