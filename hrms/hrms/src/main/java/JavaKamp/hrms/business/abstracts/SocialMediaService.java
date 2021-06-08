package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.core.utilities.results.DataResult;

import JavaKamp.hrms.entities.concretes.SocialMedia;

public interface SocialMediaService {
	
	DataResult<List<SocialMedia>> getall();
	Result add(SocialMedia socialMedia);
	Result delete(SocialMedia socialMedia);
	Result update(SocialMedia socialMedia);
	
	DataResult<List<SocialMedia>> findAllByJobseeker_Id(int jobseekerId);
}
