package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.core.utilities.results.DataResult;

import JavaKamp.hrms.entities.concretes.Experience;

public interface ExperienceService {
	
	DataResult<List<Experience>> getall();
	DataResult<List<Experience>> findByOrderByQuitDate();
	Result add(Experience experience);
	Result delete(Experience experience);
	Result update(Experience experience);
	
	DataResult<List<Experience>> findAllByJobseeker_Id(int jobseekerId);
}
