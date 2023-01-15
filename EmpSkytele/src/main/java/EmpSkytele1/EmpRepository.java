package EmpSkytele1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import EmpSkytele1.entities.EmpSky;


public interface EmpRepository extends JpaRepository<EmpSky, Long> {

	  List<EmpSky> findByAgeGreaterThan(int age);
}
