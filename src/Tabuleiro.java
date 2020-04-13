
public class Tabuleiro {
	private Peca[][] posicoes = new Peca[7][7];

	public Tabuleiro() {
		for (int y = 0; y < 7; y++) {
			for (int x = 0; x < 7; x++) {
				// Entre linhas 3 e 5 e colunas c e e, existem peças.
				// A posição 4d é vaga.
				if (y == 3 && x == 3)
					posicoes[3][3] = new Peca(false);
				else if ((y >= 2 && y <= 4) || (x >= 2 && x <= 4))
					posicoes[x][y] = new Peca(true);
			}
		}
	}
	
	public void moverPeca(Posicao posInicial, Posicao posFinal) {
		Posicao posIntermediaria = posInicial.intermediario(posFinal);
		posicoes[posFinal.x][posFinal.y] = posicoes[posInicial.x][posInicial.y];
		posicoes[posInicial.x][posInicial.y] = new Peca(false);
		posicoes[posIntermediaria.x][posIntermediaria.y] = new Peca(false);
	}
	
	public void imprimir() {
		String linhas = "7654321";
		
		for (int y = 0; y < 7; y++) {
			System.out.print(linhas.charAt(y));
			for (int x = 0; x < 7; x++) {
				if (posicoes[x][y] == null)
					System.out.print("  ");
				else if (posicoes[x][y].ehVaga())
					System.out.print(" P");
				else
					System.out.print(" -");
			}
			System.out.println();
		}
		
		System.out.println("  a b c d e f g");
	}
}
