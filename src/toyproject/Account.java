package toyproject;


/*
1.계좌 생성
2.입금
3.출금
4.잔액 조회
*/
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0; //계좌 생성 시 초기 잔액 0원
    }

    //입금 메서드
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        }else{
            System.out.println("금액을 다시 입력하세요.");
        }
    }
    // 출금 메서드
    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        }else{
            System.out.println("출금 금액을 초과했습니다.");
        }
    }
    //잔액 조회 메서드
    public void checkBalance(){
        System.out.println("현재 잔액은"+balance+"원 입니다.");
    }
}
