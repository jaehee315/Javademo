package java020_thread.part06;

public class Java216_thread {

	public static void main(String[] args) {
		AccountNumber aNumber = new AccountNumber();
		
		Bank bank = new Bank(aNumber);
		Thread aPoint = new Thread(bank, "A지점");
		aPoint.start();
		
		Bank bankB = new Bank(aNumber);
		Thread bPoint = new Thread(bankB, "B지점");
		bPoint.start();

	}//end

}
