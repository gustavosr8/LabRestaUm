
public class Main {
	public static void main(String[] args) {
		Tabuleiro t = new Tabuleiro();
		
		CSVReader csv = new CSVReader();
	    csv.setDataSource("src/db/arq001.csv");
	    String comandos[] = csv.requestCommands();
	    
	    System.out.println("Tabuleiro inicial:");
	    t.imprimir();
	    System.out.println();
	    
	    for (int i = 0; i < comandos.length; i++) {
	    	String partes[] = comandos[i].split(":");
	    	t.moverPeca(new Posicao(partes[0]), new Posicao(partes[1]));
	    	
	    	System.out.println("Source: " + partes[0]);
	    	System.out.println("Target: " + partes[1]);
		    t.imprimir();
		    System.out.println();
	    }
	}
}
