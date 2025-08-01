package at.ac.fhcampuswien.block02.examples.example05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserServiceTest {
    @Mock
    UserRepository mockUserRepo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void test_1_Is_User_Active() {
        UserRepository mockUserRepo = Mockito.mock(UserRepository.class);
        User activeUser = new User("id1", true);
        Mockito.when(mockUserRepo.findById("id1")).thenReturn(activeUser);

        UserService service = new UserService(mockUserRepo);
        assertTrue(service.isUserActive("id1"));
    }

    @Test
    void test_2_Is_User_Active() {
        // stub the mock repository so that when findById("a") is called,
        // it returns a new User with id "a"
        Mockito.when(mockUserRepo.findById("a")).thenReturn(new User("a"));

        // call findById("a") on the mock
        // (simulating the code under test using this dependency)
        mockUserRepo.findById("a");

        // check that findById("a") was indeed called on the mock repository
        Mockito.verify(mockUserRepo).findById(Mockito.eq("a"));
    }
}