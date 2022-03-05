package exercicio_7;

/* Implemente a classe Porta que possua:
• Atributos: isOpen(boolean), numAberturas(int);
• Métodos: abrir(): abre a porta e conta 1 na contagem de aberturas;
• fechar(): fecha a porta. OBS: O atributo numAberturas deve contar o total de aberturas de todas as portas possíveis. */

public class Teste {

	public static void main(String[] args) {
		Porta a = new Porta();
		a.abrir(); //Número de aberturas: 1
		a.fechar();
		a.abrir(); //Número de aberturas: 2
		a.fechar();
		a.abrir(); //Número de aberturas: 3
		
		Porta b = new Porta();
		b.abrir(); //Número de aberturas: 4
	}
}