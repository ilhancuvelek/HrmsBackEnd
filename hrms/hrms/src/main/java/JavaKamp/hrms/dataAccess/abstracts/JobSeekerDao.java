package JavaKamp.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import JavaKamp.hrms.entities.concretes.JobSeeker;




public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{

	JobSeeker getByIdentityNumber(String identityNumber);
	JobSeeker getById(int id);
	
	
}
