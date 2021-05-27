package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.UserService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.dataAccess.abstracts.UserDao;
import JavaKamp.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"data listelendi");
	}
	@Override
	public DataResult<List<User>> getByMail(String email) {
		return new SuccessDataResult<List<User>>(this.userDao.findByEmail(email));
	}

}
