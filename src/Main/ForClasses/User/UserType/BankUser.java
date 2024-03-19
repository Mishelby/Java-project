package Main.ForClasses.User.UserType;

import Main.ForClasses.User.User;
import Main.ForInterfaces.UserDeposit;

public class BankUser extends UserType implements UserDeposit {
    private int UserDeposit = 0;
    @Override
    public int createDeposit(int deposit) {
        return UserDeposit + deposit;
    }

    @Override
    public int getDeposit() {
        return UserDeposit;
    }

    @Override
    public int doOperation(int sum) {
       return UserDeposit - sum;
    }
}
