package JavaKamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer>{
	
	List<Experience> findByOrderByQuitDate();
	List<Experience> findAllByJobseeker_Id(int jobseekerId);
}
