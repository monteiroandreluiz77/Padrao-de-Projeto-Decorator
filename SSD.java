package decorator;

public class SSD extends ComputadorDecorator {
	public SSD(Computador computador) {
		super(computador);
	}
	@Override
	public void criarPc() {
		super.criarPc();
		System.out.println("Armazenamento SSD adicionado!");
	}
	}
