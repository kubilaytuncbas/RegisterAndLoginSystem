package Business.Abstracts;

import Entities.Concretes.User;

public interface LogInService {
	
	void LogIn(User user);
	void LogOut(User user);

}
