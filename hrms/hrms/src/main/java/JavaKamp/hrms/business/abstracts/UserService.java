package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.DataResult;

import JavaKamp.hrms.entities.concretes.User;



public interface UserService {
	
	DataResult<List<User>> getAll();
	DataResult<List<User>> getByMail(String email);

}
