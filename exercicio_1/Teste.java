package exercicio_1;
/* Dada a classe Pessoa, que possui os atributos: String nome, String sexo, int idade, boolean vegetariana. Faça uma classe Churrasco que possua:
Atributos: qtdCarne(double);
Método: verificarConsumo(): Recebe via parâmetro uma Pessoa, e com isto define a consumação média de carne(quantidade de carne consumida), pessoas de 0 a 3 anos não consomem, vegetarianos também não.
Pessoas de 4 a 12 anos consomem 1 kilo de carne e de 13 anos em diante 2 kilos de carne */

public class Teste {
	public static void main(String[] args) {
		
		Pessoa a = new Pessoa("Ana", "Fem", 12, false);
		Pessoa b = new Pessoa("Gustavo", "Masc", 21, true);
		Pessoa c = new Pessoa("Júlia", "Fem", 3, false);
		Pessoa d = new Pessoa("Isa", "Fem", 5, false);
		Pessoa e = new Pessoa("Cláudia", "Fem", 40, false);
		
		Churrasco sabado = new Churrasco();
		sabado.verificarConsumo(a); //Ana comeu 1.0 kg de carne.
		sabado.verificarConsumo(b); //Gustavo comeu 0.0 kg de carne.
		sabado.verificarConsumo(c); //Júlia comeu 0.0 kg de carne.
		sabado.verificarConsumo(d); //Isa comeu 1.0 kg de carne.
		sabado.verificarConsumo(e); //Cláudia comeu 2.0 kg de carne.
	}
}