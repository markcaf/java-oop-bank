package jana60.bank;

public class Conto {
	
	private int bankAccount;
	private String ownerName;
	private int bankBalance;
	
	public Conto (int bankAccount, String ownerName) {
		this.bankAccount = bankAccount;
		this.ownerName = ownerName;
		this.bankBalance = 0;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @return the bankAccount
	 */
	public int getBankAccount() {
		return bankAccount;
	}

	/**
	 * @return the bankBalance
	 */
	public int getBankBalance() {
		return bankBalance;
	}
	
	public void addMoney(int money) {
		bankBalance += money;
	}
	
	public boolean getMoney(int money) {
		if (bankBalance < money) {
			return false;
		}
		
		bankBalance -= money;
		return true;
	}

	@Override
	public String toString() {
		return ownerName
				+ "\nBank Account: " + bankAccount
				+ "\nBank Balance: " + bankBalance;
	}
	
}
