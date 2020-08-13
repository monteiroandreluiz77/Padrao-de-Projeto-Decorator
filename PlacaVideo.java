package decorator;

public class PlacaVideo extends ComputadorDecorator {
	
	public PlacaVideo(Computador computador) {
	super(computador);
}

@Override
public void criarPc() {
	super.criarPc();
	System.out.println("Placa de video dedicada adicionada!");
}
}
