package Business.Concretes;
import Business.Abstracts.LogInService;
import Business.Abstracts.ValidationService;
import Entities.Concretes.User;

public class LogInManager implements LogInService{

	ValidationService validationService;

	public LogInManager(ValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void LogIn(User user) {
		if (user.geteMail().length()==0 || user.getPassword().length()==0) {
			System.out.println("Deðerler Boþ Kalamaz");
		}
		else if(validationService.CheckIfRealPerson(user)==true) {
			System.out.println("Baþarýyla giriþ yaptýnýz");
		}else {
			System.out.println("Þifre veya Mail adresiniz yanlýþ!!");
		}
	}

	@Override
	public void LogOut(User user) {
		// TODO Auto-generated method stub
		
	}
	
	

}
