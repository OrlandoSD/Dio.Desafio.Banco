package Banco.POO;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	
	}

	@Override
	public void imprimirextrato() {
		
		System.out.println("=== Extrado Conta Poupança ===");
		super.imprimirinfosComuns();
		
	}
}
