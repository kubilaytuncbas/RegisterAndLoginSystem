package Business.Concretes;

import Business.Abstracts.LoggerService;
import Entities.Concretes.User;

public class MailLogger implements LoggerService {

	@Override
	public boolean log(User user) {
		return true;
		// TODO Auto-generated method stub
		
	}
	
	
}
