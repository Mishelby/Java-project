package Main.ForClasses.Bank.Banks;

import Main.ForClasses.Bank.AbstractBank;
import Main.ForClasses.Bank.BankInfo.BankInfo;
import Main.ForClasses.User.User;
import Main.ForInterfaces.Conditions;

public class CommercialBank extends AbstractBank {
    public CommercialBank(BankInfo bankInfo) {
        super(bankInfo);
    }

    @Override
    public void BecomeABankUser() {
        System.out.println(Conditions.COMMERCIAL);
    }

    @Override
    public void FulfillTheConditions(User user) {

        user.getUserInfo().setBankStatus(true);
    }
}
