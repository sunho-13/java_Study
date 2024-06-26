/*

package demoJson;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    AccountRepository accountRepository;

    public AccountServiceImpl(String arg1, String fileName) throws Exception {
        if ( "-j".equals(arg1) ) {
            accountRepository = new AccountJSONRepository(fileName);
        } else if ( "-t".equals(arg1) ) {
            accountRepository = new AccountFileRepository(fileName);
        } else {
            throw new Exception( "Error : You need program arguments (-j/-t) (filename) !");
        }
    }

    public void setInitRepository(String arg1, String fileName) throws Exception {
        if ( "-j".equals(arg1) ) {
            accountRepository = new AccountJSONRepository(fileName);
        } else if ( "-t".equals(arg1) ) {
            accountRepository = new AccountFileRepository(fileName);
        } else {
            throw new Exception( "Error : You need program arguments (-j/-t) (filename) !");
        }
    }

    private List<Account> accountList = new ArrayList<>();

    public int size() {
        return this.accountList.size();
    }

    public void clear() {
        this.accountList.clear();
    }

    public boolean addAccount(String name, String bankAccount, int money) {
        return this.accountList.add(new Account(name, bankAccount, money));
    }

    public boolean addAccount(Account account) {
        return this.accountList.add(account);
    }

    public List<Account> getAllAccount() {
        return this.accountList;
    }

    public boolean deposit(String bankAccount, int money) {
        Account account = this.findAccountByNumber(bankAccount);
        if ( account == null ) {
            return false;
        }
        account.setCurrent(account.getCurrent() + money);
        return true;
    }

    public boolean withdraw(String bankAccount, int money) {
        Account account = this.findAccountByNumber(bankAccount);
        if ( account == null ) {
            return false;
        }
        if ( account.getCurrent() >= money ) {
            account.setCurrent(account.getCurrent() - money);
            return true;
        } else {
            return false;
        }
    }

    public Account findAccountByNumber( String bankAccount ) {
        if ( bankAccount == null || bankAccount.isEmpty() ) {
            return null;
        }
        for ( Account account : accountList ) {
            if ( bankAccount.equals(account.getBankNumber()) ) {
                return account;
            }
        }
        return null;
    }

    public void loadData(List<Account> list) throws Exception {
        accountRepository.loadJson(list);
    }

    public void saveData(List<Account> list) throws Exception {
        accountRepository.saveJson(list);
    }
}
*/
