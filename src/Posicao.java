
public class Posicao {
	int x;
	int y;

	private Posicao(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Posicao(String str) {
		String linhas = "7654321";
		String colunas = "abcdefg";

		x = colunas.indexOf(Character.toLowerCase(str.charAt(0)));
		y = linhas.indexOf(Character.toLowerCase(str.charAt(1)));
	}
	
	// Retorna a posição intermediária entre duas posições
	public Posicao intermediario(Posicao o) {
		return new Posicao((x + o.x) / 2, (y + o.y) / 2);
	}
}
