package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.CoverLetterService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.CoverLetterDao;

import JavaKamp.hrms.entities.concretes.CoverLetter;
import JavaKamp.hrms.core.utilities.results.Result;
@Service
public class CoverLetterManager implements CoverLetterService{
	
	private CoverLetterDao coverLetterDao;
	
	@Autowired
		public CoverLetterManager(CoverLetterDao coverLetterDao) {
			super();
			this.coverLetterDao = coverLetterDao;
		}

	@Override
	public DataResult<List<CoverLetter>> getall() {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll());
		
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult();
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		this.coverLetterDao.delete(coverLetter);
		return new SuccessResult();
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<CoverLetter>> findAllByJobseeker_Id(int jobseekerId) {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAllByJobseeker_Id(jobseekerId));
	}

}
