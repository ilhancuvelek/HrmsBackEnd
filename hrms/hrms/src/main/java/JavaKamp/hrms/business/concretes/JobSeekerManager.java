package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.JobSeekerService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.ErrorResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.JobSeekerDao;
import JavaKamp.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobseekerDao;
	@Autowired
	public JobSeekerManager(JobSeekerDao jobseekerDao) {
		super();
		this.jobseekerDao = jobseekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobseekerDao.findAll(),"iş arayanlar listelendi");
				
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(getByIdentityNumber(jobSeeker.getIdentityNumber()).getData() != null){
	         return new ErrorResult("Aynı tcno zaten var.");
	    }
	   this.jobseekerDao.save(jobSeeker);
	   return new SuccessResult("İş arayan eklendi");
		
		
	}

	@Override
	public DataResult<JobSeeker> getByIdentityNumber(String identityNumber) {
		
		return new SuccessDataResult<JobSeeker>(this.jobseekerDao.getByIdentityNumber(identityNumber));
	}

}
