import java.util.List;

public interface UserRepository {
	User findById(int id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void delete(User user);
}
