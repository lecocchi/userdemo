package ar.com.comafi.controller;

import ar.com.comafi.model.User;
import ar.com.comafi.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class UserControllerTest {

    @Mock
    private UserService userService;

    private UserController userController;


    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
        userController = new UserController(userService);
    }


    @Test
    public void testCreatedUserSuccessful(){

        User user = new User("pepe");

        when(userService.create(any())).thenReturn(user);

        User userTest = userController.create(user);

        assertSame(user, userTest);

    }
}
