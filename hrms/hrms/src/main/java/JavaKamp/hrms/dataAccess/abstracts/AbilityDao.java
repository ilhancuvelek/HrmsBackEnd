package JavaKamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.Ability;


public interface AbilityDao extends JpaRepository<Ability, Integer>{
	List<Ability> findAllByJobseeker_Id(int jobseekerId);
}
