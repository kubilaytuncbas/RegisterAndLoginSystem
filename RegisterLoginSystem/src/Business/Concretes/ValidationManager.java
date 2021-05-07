package Business.Concretes;

import Business.Abstracts.ValidationService;
import Entities.Concretes.User;

public class ValidationManager implements ValidationService{
	public boolean CheckIfRealPerson(User user) {
		// TODO Auto-generated method stub
		if (user.geteMail()=="tuncbaskubilay@gmail.com" && user.getPassword()=="1234567890") {
			
			return true;
		}
		return false;
	}

}
