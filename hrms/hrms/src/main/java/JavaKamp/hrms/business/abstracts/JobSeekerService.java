package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.JobSeeker;



public interface JobSeekerService {
	
	DataResult<List<JobSeeker>> getAll();
	DataResult<JobSeeker> getByIdentityNumber(String identityNumber);
	Result add(JobSeeker jobSeeker);

}
