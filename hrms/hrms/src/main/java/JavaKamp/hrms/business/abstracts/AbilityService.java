package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.entities.concretes.Ability;

public interface AbilityService {
	
	DataResult<List<Ability>> getall();
	Result add(Ability abilitiy);
	Result delete(Ability abilitiy);
	Result update(Ability abilitiy);
	
	DataResult<List<Ability>> findAllByJobseeker_Id(int jobseekerId);

}
