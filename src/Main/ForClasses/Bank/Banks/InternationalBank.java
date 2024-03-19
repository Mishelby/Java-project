package Main.ForClasses.Bank.Banks;

import Main.ForClasses.Bank.AbstractBank;
import Main.ForClasses.Bank.BankInfo.BankInfo;
import Main.ForClasses.User.User;
import Main.ForInterfaces.Conditions;

import static Main.ForInterfaces.Conditions.INTERNATIONAL;

public class InternationalBank extends AbstractBank {
    public InternationalBank(BankInfo bankInfo) {
        super(bankInfo);
    }

    @Override
    public void BecomeABankUser() {
        System.out.println(Conditions.INTERNATIONAL);
    }

    @Override
    public void FulfillTheConditions(User user) {

        user.getUserInfo().setBankStatus(true);
    }
}
