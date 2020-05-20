package quiz_game;

import ex10accessModifier.AccountDAO;

public class bankAccount {
	
	private String name;//예금주
	private String accountNumber;//계좌번호
	private int balance;//잔액(잔고)
	//기본생성자,인자생성자(필요한 경우에만 정의한다.)
	
	public bankAccount() {}
	public bankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//2.getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "예금주 : "+name+",계좌번호: "+account+",잔액: "+balance;
	}*/
	

	private bankAccount capsule = new bankAccount();
	
	public void init(String name,String accNumber,int balance) {
		capsule.setName(name);
		capsule.setAccountNumber(accNumber);
		capsule.setBalance(balance);
	}
	// 저축
		public void deposit(int money) {
			capsule.setBalance(capsule.getBalance()+money);
			System.out.println(money+"원이 입금되었습니다.");
			printAccount();
		}
		
		//출금
		public void withdraw(int money) {
			if(capsule.getBalance()<money) {
				System.out.println("잔액부족합니다.");
				return;
			}
			capsule.setBalance(capsule.getBalance()-money);
			System.out.println(money+"원이 출금되었습니다.");
			printAccount();
		}
		
		//통장정보출력
		public void printAccount() {
			System.out.printf("[%s님의 계좌정보]\n",capsule.getName());
			System.out.printf("계좌번호:%s\n",capsule.getAccountNumber());
			System.out.printf("잔액:%d원\n",capsule.getBalance());
		}
	
	public static void main(String[] args) {
		
		AccountDAO cap = new AccountDAO();
		
		//데이터 초기화를 통해 DTO객체 생성
		cap.init("자바맨", "123-456", 10000);
		
		cap.printAccount();
		
		cap.deposit(15000);
		
		cap.withdraw(30000);
		
		//통장정보출력
		cap.printAccount();
	}
}
