package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.core.utilities.results.DataResult;

import JavaKamp.hrms.entities.concretes.Language;

public interface LanguageService {
	
	DataResult<List<Language>> getall();
	Result add(Language language);
	Result delete(Language language);
	Result update(Language language);
	
	DataResult<List<Language>> findAllByJobseeker_Id(int jobseekerId);
	
}
