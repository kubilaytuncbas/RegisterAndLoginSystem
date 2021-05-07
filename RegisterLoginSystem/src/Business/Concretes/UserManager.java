package Business.Concretes;
import Business.Abstracts.LoggerService;
import Business.Abstracts.UserService;
import Core.Concretes.EmailValidator;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {
 
	UserDao userDao;
	LoggerService loggerService;
	
	
	public UserManager(UserDao userDao,LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(User user) {
		if(EmailValidator.isEmailValid(user.geteMail())!=true) 
		{
			System.out.println("Mail Yap�s� Yanl��");
			
				}
		else if (recordCheck(user)!=true) { 
			System.out.println("Kullan�c� Eklenemedi"
					+ " Parola en az 6 karakterli"
					+ " �sim ve Soyisim en az 2 karakterli olmal�d�r!!"
					+ " Email bilginiz yap�ya uymuyor");
		
		}
		else if(userDao.emailCheck(user.geteMail())!=true) {
			
			System.out.println("Ayn� Mail adresi ile daha �nceden kay�t bulunmakta!!");
		}
		else {
			userDao.add(user);
			loggerService.log(user);
		}
		
		}
	
				

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean recordCheck(User user) {
		
		if (user.getPassword().length()<6  || user.getFirstName().length()<2 || user.getLastName().length()<2) {
			
			return false;			
		}
		else {
			return true;
		}
			
		
			
		
	}
	

}
