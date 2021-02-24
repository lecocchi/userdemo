package ar.com.comafi.repository;

import ar.com.comafi.exception.ConnectionException;
import ar.com.comafi.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User save(User user){
        throw new ConnectionException("Hubo un error en la base de datos", 1025);
    }
}
