package Main.ForTests;

import Main.ForClasses.User.User;
import Main.ForClasses.User.UserInfo.UserInfo;
import Main.ForClasses.User.UserType.BankUser;
import Main.ForClasses.User.UserType.FreeUser;
import Main.ForErrors.UserInfoError;
import Main.ForErrors.UserTypeError;

public class CreateUser {
    public static void main(String[] args) {
        try {
            User<FreeUser> user = createUser("Misha", 26, "Secret");
            System.out.println(user);
        } catch (UserInfoError | UserTypeError e) {
            e.printStackTrace();
        }
    }

    public static User createUser(String name, int age, String secretWord) throws UserTypeError, UserInfoError {
        User user = new User(new UserInfo(name, age, secretWord));
        return user;
    }
}
