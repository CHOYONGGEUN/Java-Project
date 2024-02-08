package toyproject.bank;
import java.util.HashMap;
import java.util.Scanner;

public class BankSystem {
    private static HashMap<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1: 계좌 생성 | 2: 입금 | 3: 출금 | 4: 잔액 조회 |  5: 이체 | 6:계좌 삭제 | 7: 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 숫자 입력 후 엔터키 처리

            switch (choice) {
                case 1:
                    System.out.print("새 계좌 번호를 입력하세요: ");
                    String newAccountNumber = scanner.nextLine();
                    accounts.put(newAccountNumber, new Account(newAccountNumber));
                    System.out.println("계좌가 생성되었습니다.");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print("계좌 번호를 입력하세요: ");
                    String accountNumber = scanner.nextLine();
                    Account account = accounts.get(accountNumber);
                    if (account == null) {
                        System.out.println("계좌를 찾을 수 없습니다.");
                        break;
                    }
                    if (choice == 2) {
                        System.out.print("입금할 금액을 입력하세요: ");
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                    } else if (choice == 3) {
                        System.out.print("출금할 금액을 입력하세요: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                    } else {
                        account.checkBalance();
                    }
                    break;
                case 5:
                    System.out.println("출금할 계좌 번호를 입력하세요: ");
                    String fromAccountNumber = scanner.nextLine();
                    Account fromAccount = accounts.get(fromAccountNumber);
                    if(fromAccount == null){
                        System.out.println("출금 계좌를 찾을 수 없습니다.");
                        break;
                    }
                    System.out.println("입금할 계좌 번호를 입력하세요: ");
                    String toAccountNumber = scanner.nextLine();
                    Account toAccount = accounts.get(toAccountNumber);
                    if(toAccount == null) {
                        System.out.println("출금 계좌를 찾을 수 없습니다.");
                        break;
                    }
                    System.out.println("이제할 금액을 입력하세요: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); // 숫자 입력 후 엔터 키 처리
                    fromAccount.transfer(toAccount,transferAmount);
                    break;
                case 6:
                    System.out.println("삭제할 계좌 번호를 입력하세요: ");
                    String deleteAccountNumber = scanner.nextLine();
                    if(accounts.containsKey(deleteAccountNumber)){
                        accounts.remove(deleteAccountNumber);
                        System.out.println("계좌가 삭제되었습니다.");
                    }else{
                        System.out.println("계좌를 찾을 수 없습니다.");
                    }
                    break;
            }
        }
        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }
}
