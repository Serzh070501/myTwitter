package am.mytwitter;


import am.mytwitter.demo.models.User;
import am.mytwitter.demo.services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Valod","val",2);
   //    userService.saveUser(user);
        userService.findUser(1);
//       System.out.println(userDAO.findById(1).toString());
    }
}
