package Core.Concretes;
import Core.Abstracts.RegisterService;
import GoogleWithRegister.GoogleWithRegister;

public class GoogleWithRegisterAdapter implements RegisterService {

	@Override
	public void add(String message) {
		// TODO Auto-generated method stub
		GoogleWithRegister googleWithRegister=new GoogleWithRegister();
		googleWithRegister.add(message);
	}

}
