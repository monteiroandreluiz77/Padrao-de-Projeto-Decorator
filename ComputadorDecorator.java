package decorator;

public abstract class ComputadorDecorator implements Computador {
	
	protected Computador computador;
	
	ComputadorDecorator(Computador computador) {
		this.computador = computador;		
	}
	@Override
	public void criarPc() {
		this.computador.criarPc();
		
	}
	
	

}
