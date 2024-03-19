package Main.ForClasses.User.UserInfo;

import java.util.Random;

public class UserBankInfo {
    private String secretWord;
    private final int CODE_LENGTH = 5;
    private final String NUMBERS = "1234567890";

    public UserBankInfo(String secretWord) {
        this.secretWord = secretWord;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public int getCodeLength() {
        return CODE_LENGTH;
    }

    public String getNUMBERS() {
        return NUMBERS;
    }


    @Override
    public String toString() {
        return "UserBankInfo{" +
                "secretWord='" + secretWord + '\'' +
                '}';
    }
}
