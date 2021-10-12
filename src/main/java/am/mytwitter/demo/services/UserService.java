package am.mytwitter.demo.services;



import am.mytwitter.DAO.UserDAO;
import am.mytwitter.demo.models.Post;
import am.mytwitter.demo.models.User;

import java.util.List;

public class UserService {

    private UserDAO usersDao = new UserDAO();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(int id) {
        usersDao.delete(id);
    }

    public void updateUser(int id,User user) {
        usersDao.update(id,user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Post findAutoById(int id) {
        return usersDao.findPostById(id);
    }


}
