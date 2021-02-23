package ar.com.comafi.service;

import ar.com.comafi.model.User;
import ar.com.comafi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public User create(User user){
        return userRepository.save(user);
    }
}
