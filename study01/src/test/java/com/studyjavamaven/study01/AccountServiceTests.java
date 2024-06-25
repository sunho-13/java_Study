package com.studyjavamaven.study01;

import demoJson.Account;
import org.junit.jupiter.api.Test;
import demoJson.AccountService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AccountServiceTests {

    AccountSerivce accountService;

    @BeforEach
    public void

    @Test
    public void addAccountTest(){
        AccountService accountService = new AccountService();

        accountService.clear();
        accountService.addAccount("이선호", "111-111", 11111);

        assertThat(accountService.size()).isEqualTo(1);

        Account find = accountService.findAccountByNumber("111-111");
        assertThat(find).isNotNull();
        assertThat(find.getName()).isEqualTo("이선호");
        assertThat(find.getCurrent()).isEqualTo(11111);
    }

    @Test
    public void depositTest(){
        AccountService accountService = new AccountService();
        accountService.addAccount("이선호", "111-111", 22222);
        accountService.addAccount("김선호", "222-222", 33333);
        assertThat(accountService.size()).isEqualTo(2);

        boolean result = accountService.deposit("222-222", 10000);
        assertThat(result).isEqualTo(true);

        Account find = accountService.findAccountByNumber("222-222");
        assertThat(find).isNotNull();
        assertThat(find.getCurrent()).isEqualTo(40000);

        Account find2 = accountService.findAccountByNumber("444-444");
        assertThat(find2).isNull();
    }

    @Test
    public void withdrawTest(){
        AccountService accountService = new AccountService();
        accountService.addAccount("이선호", "333-333", 50000);
        assertThat(accountService.size()).isEqualTo(1);

        boolean result = accountService.withdraw("333-333", 10000);
        assertThat(result).isEqualTo(true);

        Account find = accountService.findAccountByNumber("333-333");
        assertThat(find).isNotNull();
        assertThat(find.getCurrent()).isEqualTo(20000);

        Account find2 = accountService.findAccountByNumber("555-555");
        assertThat(find2).isNull();

        boolean result2 = accountService.withdraw("333-333", 30000);
        assertThat(result2).isEqualTo(false);

        Account find3 = accountService.findAccountByNumber("333-333");
        assertThat(find3).isNotNull();
        assertThat(find3.getCurrent()).isEqualTo(20000);
    }
}
