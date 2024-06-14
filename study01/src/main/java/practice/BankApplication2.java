package practice;

import java.util.Scanner;

public class BankApplication2 {
    private static class Account {
        private String num;
        private String name;
        private int money;

        public Account(String num, String name, int money) {
            this.num = num;
            this.name = name;
            this.money = money;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }
    }

    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");
            int select = sc.nextInt();

            if (select == 1) {
                createAccount();
            } else if (select == 2) {
                accountList();
            } else if (select == 3) {
                deposit();
            } else if (select == 4) {
                withdraw();
            } else if (select == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static Account findAccount(String num) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                if (accountArray[i].getNum().equals(num)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }

    private static void createAccount() {
        System.out.println("------------------------");
        System.out.println("계좌생성");
        System.out.println("------------------------");

        System.out.print("계좌번호: ");
        String num = sc.next();

        System.out.print("계좌주: ");
        String name = sc.next();

        System.out.print("초기입금액:");
        int money = sc.nextInt();

        Account account = new Account(num, name, money);

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = account;
                System.out.println("결과 : 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("------------------------");
        System.out.println("계좌목록");
        System.out.println("------------------------");

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                break;
            }
            System.out.println(accountArray[i].getNum() + "\t"
                    + accountArray[i].getName() + "\t" + accountArray[i].getMoney());
        }
    }

    private static void deposit() {
        System.out.println("------------------------");
        System.out.println("예금");
        System.out.println("------------------------");

        System.out.print("계좌번호: ");
        String num = sc.next();

        System.out.print("예금액: ");
        int money = sc.nextInt();

        Account account = findAccount(num);

        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }

        account.setMoney(account.getMoney() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static void withdraw() {
        System.out.println("------------------------");
        System.out.println("출금");
        System.out.println("------------------------");

        System.out.print("계좌번호: ");
        String num = sc.next();

        System.out.print("출금액: ");
        int money = sc.nextInt();

        Account account = findAccount(num);

        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }

        if (account.getMoney() < money) {
            System.out.println("예금액보다 출금액이 많아 출금할 수 없습니다.");
            return;
        }

        account.setMoney(account.getMoney() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }
}
