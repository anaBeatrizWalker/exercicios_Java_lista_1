package exercicio_6;

/* Implemente a classe Eq2Grau que possua:
• Atributos: a,b e c (doubles);
• Métodos: delta(): retorna o delta da equação;
• raiz1(): retorna a primeira raiz se ∆ ≥ 0, se não retorna NaN;
• raiz2(): retorna a segunda raiz se ∆ ≥ 0, se não retorna NaN. */

public class Teste {

	public static void main(String[] args) {
		
		Eq2Grau z = new Eq2Grau(5, 9, 3);
		
		System.out.println("Delta: " + z.delta());
		System.out.println("Raiz 1: " + z.raiz1());
		System.out.println("Raiz 2: " + z.raiz2());
	}
}