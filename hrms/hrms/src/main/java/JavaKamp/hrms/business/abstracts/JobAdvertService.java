package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {
	
	Result add(JobAdvert jobAdvert);
	Result delete(int jobAdvertId);
	
	DataResult<List<JobAdvert>>  getAllActiveJobAdvert();
	DataResult<List<JobAdvert>> getAllByOpenAndDeadlineJobAdvert();
	DataResult<List<JobAdvert>> getAll();
	
	DataResult<List<JobAdvert>> getByCity(int cityId);
	
	

}
