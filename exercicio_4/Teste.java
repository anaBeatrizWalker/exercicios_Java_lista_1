package exercicio_4;

/* Implemente uma classe que modele um triangulo equilátero(lados iguais)
Atributos: lado, perímetro, área.
Métodos: calcArea(), calcPerímeto() e seus gets. O lado deverá ser o único atributo inicializado via construtor.
Fórmulas:
Área = lado * √3/2
Perímetro= 3*lado */

public class Teste {

	public static void main(String[] args) {
		Triangulo a = new Triangulo(5);
		System.out.println("Área: " + a.calcArea());
		System.out.println("Perímetro: " + a.calcPerimetro());
	}
}