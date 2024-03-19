package Main.ForClasses.User.UserInfo;

import Main.ForClasses.Bank.BankInfo.BankInfo;
import Main.ForInterfaces.CreateCode;

import java.util.Random;

public class UserInfo implements CreateCode {
    private String name;
    private int age;
    private int id;
    private boolean bankStatus = false;
    private static int nextId = 1;
    private final String bankCode;
    private UserBankInfo bankInfo;
    private StringBuilder sb = new StringBuilder();
    private Random random = new Random();

    public UserInfo(String name, int age, String secretWord) {
        this.name = name;
        this.age = age;
        this.bankCode = create(secretWord);
        this.id = getNextId();
    }

    @Override
    public String create(String secretWord) {
        bankInfo = new UserBankInfo(secretWord);

        if(secretWord.length() <= 10){
            for (int i = 0; i < secretWord.length(); i++) {
                int r = random.nextInt(secretWord.length());

                sb.append(bankInfo.getSecretWord().charAt(r));
                sb.append(bankInfo.getNUMBERS().charAt(r));
            }
        }else{
            throw new IllegalArgumentException("Incorrect secret word length!");
        }

        return sb.toString();
    }

    @Override
    public String showBankCode() {
        return bankCode;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", bankCode='" + bankCode + '\'' +
                ", bankInfo=" + bankInfo +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isBankStatus() {
        return bankStatus;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBankStatus(boolean bankStatus) {
        this.bankStatus = bankStatus;
    }
}
