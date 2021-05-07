package DataAccess.Concretes;
import java.util.ArrayList;
import java.util.List;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;


public class InMemoryUserDao implements UserDao {

	
	List<User> users=new ArrayList<User>();

	@Override
	public void add(User user) {
		
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
			users.remove(user);
		
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
	
	}
	public boolean emailCheck(String email) {
		for(User user:users) {
			if (user.geteMail()!=email) {
					return true;
			}
		}
			return false;
	}
	
		
			
		
		
		
	
	
	
	
	

}
