package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.JobAdvertService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.JobAdvertDao;
import JavaKamp.hrms.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService{
	
	private JobAdvertDao jobAdvetDao;
	@Autowired	
	public JobAdvertManager(JobAdvertDao jobAdvetDao) {
		super();
		this.jobAdvetDao = jobAdvetDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvetDao.save(jobAdvert);
		return new SuccessResult("job advert eklendi");
	}

	@Override
	public Result delete(int jobAdvertId) {
		this.jobAdvetDao.deleteById(jobAdvertId);
		return new SuccessResult("job advert silindi");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllActiveJobAdvert() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvetDao.getAllActiveJobAdvert(),"Aktif job advert listelendi");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByOpenAndDeadlineJobAdvert() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvetDao.getAllByOpenAndDeadlineJobAdvert(),"data listelendi");
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvetDao.findAll(),"job advert listelendi");
	}

}
