package Main.ForTests;

import Main.ForClasses.Bank.BankInfo.BankInfo;
import Main.ForClasses.Bank.Banks.InvestmentBank;

public class CreateBank {
    public static void main(String[] args) {
        InvestmentBank investmentBank = new InvestmentBank(new BankInfo("InBank", 5000));
        investmentBank.BecomeABankUser();
    }
}
