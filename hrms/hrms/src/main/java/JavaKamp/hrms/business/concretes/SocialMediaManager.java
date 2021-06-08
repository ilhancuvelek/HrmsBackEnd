package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.SocialMediaService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.SocialMediaDao;

import JavaKamp.hrms.entities.concretes.SocialMedia;
@Service
public class SocialMediaManager implements SocialMediaService{
	
	private SocialMediaDao socialMediaDao;
	
	@Autowired
	public SocialMediaManager(SocialMediaDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public DataResult<List<SocialMedia>> getall() {
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAll());
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult();
	}

	@Override
	public Result delete(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult();
	}

	@Override
	public Result update(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<SocialMedia>> findAllByJobseeker_Id(int jobseekerId) {
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAllByJobseeker_Id(jobseekerId));
	}

}
