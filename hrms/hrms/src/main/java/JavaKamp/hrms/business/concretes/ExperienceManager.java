package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.business.abstracts.ExperienceService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.ExperienceDao;

import JavaKamp.hrms.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService{
	
	private ExperienceDao experienceDao;
	
	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public DataResult<List<Experience>> getall() {
		return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll());
	}

	@Override
	public DataResult<List<Experience>> findByOrderByQuitDate() {
		return new SuccessDataResult<List<Experience>>(this.experienceDao.findByOrderByQuitDate());
	}

	@Override
	public Result add(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult();
	}

	@Override
	public Result delete(Experience experience) {
		this.experienceDao.delete(experience);
		return new SuccessResult();
	}

	@Override
	public Result update(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Experience>> findAllByJobseeker_Id(int jobseekerId) {
		return new SuccessDataResult<List<Experience>>(this.experienceDao.findAllByJobseeker_Id(jobseekerId));
	}

}
