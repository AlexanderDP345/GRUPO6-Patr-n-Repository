import java.util.List;
public class Main {

	public static void main(String[] args) {
		UserRepository userRepository = new UserRepositoryImpl();

        
        User user1 = new User(1, "usuario1", "usuario1@example.com");
        User user2 = new User(2, "usuario2", "usuario2@example.com");

        userRepository.save(user1);
        userRepository.save(user2);

        System.out.println("Todos los usuarios:");
        List<User> allUsers = userRepository.findAll();
        for (User user : allUsers) {
            System.out.println(user.getId() + ": " + user.getUsername() + " - " + user.getEmail());
        }
    

	}

}
