package Main.ForClasses.User;

import Main.ForClasses.User.UserInfo.UserInfo;
import Main.ForClasses.User.UserType.BankUser;
import Main.ForClasses.User.UserType.FreeUser;
import Main.ForClasses.User.UserType.UserType;
import Main.ForErrors.UserInfoError;
import Main.ForErrors.UserTypeError;

public class User<T extends UserType> {
    private FreeUser freeUserType;
    private BankUser bankUserType;
    private UserInfo userInfo;

    public User(UserInfo userInfo) throws UserTypeError, UserInfoError {
        if(!userInfo.isBankStatus()){
            this.freeUserType = new FreeUser();
        }else {
            throw new UserTypeError("Incorrect User Type");
        }
        if(userInfo != null){
            this.userInfo = userInfo;
        }else{
            throw new UserInfoError("Incorrect User Info");
        }
    }

    public FreeUser getUserType() {
        return freeUserType;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserType(BankUser userType) {
        if(userInfo.isBankStatus()){
            freeUserType = null;
            bankUserType = new BankUser();
        }else{
            System.err.println("You can't do it now!");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userType=" + freeUserType +
                ", userInfo=" + userInfo +
                '}';
    }
}
