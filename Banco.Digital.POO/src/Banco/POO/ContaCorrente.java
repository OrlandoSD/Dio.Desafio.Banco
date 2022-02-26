package Banco.POO;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirextrato() {

		System.out.println("=== Extrado Conta Corrente ===");
		imprimirinfosComuns();
		
	}

}
