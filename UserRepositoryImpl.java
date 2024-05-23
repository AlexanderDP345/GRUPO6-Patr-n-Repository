import java.util.List;
import java.util.ArrayList;

public class UserRepositoryImpl implements UserRepository {

	private List<User> users = new ArrayList<>(); ;
	 
	@Override
	public User findById(int id) {
		for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
	  }
		return null;
}

	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public void save(User user) {
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		 for (User u : users) {
	            if (u.getId() == user.getId()) {
	                u.setUsername(user.getUsername());
	                u.setEmail(user.getEmail());
	                break;
	            }
	        }
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		
	}

}

