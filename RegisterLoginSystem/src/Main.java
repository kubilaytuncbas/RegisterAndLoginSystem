import Business.Abstracts.LogInService;
import Business.Abstracts.UserService;
import Business.Concretes.LogInManager;
import Business.Concretes.MailLogger;
import Business.Concretes.UserManager;
import Business.Concretes.ValidationManager;
import DataAccess.Concretes.InMemoryUserDao;
import Entities.Concretes.User;


public class Main {

	public static void main(String[] args) {
		User user=new User("kubilay","tuncbas","tuncbaskubilay@gmail.com","1234567890");
		UserService userService=new UserManager(new InMemoryUserDao(),new MailLogger());
		userService.add(user);
		LogInService logInService=new LogInManager(new ValidationManager());
		logInService.LogIn(user);
		
	}

}
