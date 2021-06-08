package JavaKamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import JavaKamp.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {
	
	@Query("From JobAdvert where isActive=true ")
	List<JobAdvert> getAllActiveJobAdvert();
	
	@Query("From JobAdvert where isOpen=true Order By deadline Asc")
	List<JobAdvert> getAllByOpenAndDeadlineJobAdvert();
	
	List<JobAdvert>  getByCity_CityId(int cityId);

}
