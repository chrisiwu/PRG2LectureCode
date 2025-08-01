package at.ac.fhcampuswien.block02.examples.example05;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isUserActive(String userId) {
        User user = userRepository.findById(userId); // hits the real database!
        return user != null && user.isActive();
    }
}