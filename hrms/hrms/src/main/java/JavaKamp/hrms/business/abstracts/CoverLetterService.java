package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.core.utilities.results.DataResult;

import JavaKamp.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService{
	
	DataResult<List<CoverLetter>> getall();
	Result add(CoverLetter coverLetter);
	Result delete(CoverLetter coverLetter);
	Result update(CoverLetter coverLetter);
	
	DataResult<List<CoverLetter>> findAllByJobseeker_Id(int jobseekerId);
}
