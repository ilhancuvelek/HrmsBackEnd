package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.AbilityService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.AbilityDao;
import JavaKamp.hrms.entities.concretes.Ability;

@Service
public class AbilityManager implements AbilityService{
	
	private AbilityDao abilitydao;

	@Autowired
	public AbilityManager(AbilityDao abilitydao) {
		super();
		this.abilitydao = abilitydao;
	}

	@Override
	public DataResult<List<Ability>> getall() {
		return new SuccessDataResult<List<Ability>>(this.abilitydao.findAll());
	}

	

	@Override
	public Result add(Ability abilitiy) {
		this.abilitydao.save(abilitiy);
		return new SuccessResult();
	}

	@Override
	public Result delete(Ability abilitiy) {
		this.abilitydao.delete(abilitiy);
		return new SuccessResult();
	}

	@Override
	public Result update(Ability abilitiy) {
		this.abilitydao.save(abilitiy);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Ability>> findAllByJobseeker_Id(int jobseekerId) {
		return new SuccessDataResult<List<Ability>>(this.abilitydao.findAllByJobseeker_Id(jobseekerId));
	}

}
