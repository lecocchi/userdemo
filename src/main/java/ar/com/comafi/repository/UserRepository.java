package ar.com.comafi.repository;

import ar.com.comafi.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User save(User user){
        return user;
    }
}
