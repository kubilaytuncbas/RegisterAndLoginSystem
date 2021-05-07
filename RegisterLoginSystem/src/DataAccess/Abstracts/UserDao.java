package DataAccess.Abstracts;
import Entities.Concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean emailCheck(String email);
}
