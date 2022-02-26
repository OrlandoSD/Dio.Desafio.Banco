package Banco.POO;

public class Controle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cliente rubens = new Cliente();
		rubens.setNome("Rubens");
		
		Conta cc = new ContaCorrente(rubens);
		Conta cp = new ContaPoupanca(rubens);
		cp.depositar(50);
		cc.depositar(100);
		cp.transferir(100,cp);
		
		cc.imprimirextrato();
		cp.imprimirextrato();

	}

}
