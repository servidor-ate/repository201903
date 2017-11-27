package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.User;

import java.util.List;

public interface UserDao extends AbstractDao<User, String> {
    void saveUser(User user);
    List<User> findUsers(String userName);
}
