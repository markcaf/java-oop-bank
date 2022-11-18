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
	
}
