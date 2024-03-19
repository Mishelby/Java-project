package Main.ForClasses.Bank.BankInfo;

public class BankInfo {
    private String bankName;
    private int countOfClients;

    public BankInfo(String bankName, int countOfClients) {
        this.bankName = bankName;
        this.countOfClients = countOfClients;
    }

    public String getBankName() {
        return bankName;
    }

    public int getCountOfClients() {
        return countOfClients;
    }
}
