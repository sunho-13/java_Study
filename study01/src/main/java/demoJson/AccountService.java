package demoJson;

import java.util.ArrayList;
import java.util.List;

public interface AccountService {
    int size();
    void clear();
    boolean addAccount(String name, String bankAccount, int money);
    boolean addAccount(Account account);
    List<Account> accountList;
    boolean deposit(String bankAccount, int money);
    boolean withdraw(String bankAccount, int money);
    Account findAccountByNumber( String bankAccount );

}
