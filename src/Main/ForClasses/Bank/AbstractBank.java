package Main.ForClasses.Bank;

import Main.ForClasses.Bank.BankInfo.BankInfo;
import Main.ForInterfaces.UserBank;

public abstract class AbstractBank implements UserBank {
    private BankInfo bankInfo;

    public AbstractBank(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

}
