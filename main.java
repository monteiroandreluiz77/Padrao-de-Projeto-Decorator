 package decorator;

public class main {
	public static void main(String[] args) {
		Computador pc = new PlacaVideo(new SSD(new ComputadorComponenteConcreto()));
		pc.criarPc();
		System.out.println("");
		Computador notebook = new ComputadorComponenteConcreto();
		
		notebook.criarPc();
	}

}
