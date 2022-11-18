package jana60.bank;

public class Main {

	public static void main(String[] args) {

		Conto c = new Conto(2342342, "Pippo");
		System.out.println(c);
		System.out.println("-----------------");
		
		c.addMoney(100);
		System.out.println(c);
		System.out.println("Deposito avvenuto con successo");
		
		System.out.println("-----------------");
		
		boolean res = c.getMoney(40);
		System.out.println("Risultato prelievo: " + res);
		System.out.println("-----------------");
		System.out.println(c);
		
		System.out.println("-----------------");
		
		res = c.getMoney(140);
		System.out.println("Risultato prelievo: " + res);
		System.out.println("-----------------");
		System.out.println(c);
	}

}
