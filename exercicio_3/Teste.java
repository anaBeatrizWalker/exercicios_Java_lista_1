package exercicio_3;

/* Implemente uma classe chamada Complexo para representar números imaginários e esta deve possuir:
Atributos: dois doubles a(Parte real) e b(Parte imaginária).
Métodos:
1) Construtor;
2) soma(): recebe via parâmetro outro número complexo(objeto desta classe) e efetua sua soma, ou seja, parte real será somada com parte real, e parte imaginária com parte imaginária;
3) multiplica(): recebe via parâmetro outro complexo(objeto desta classe) e efetue a formula (a+bi)*(c+di) = (ac-bd)+(ad+bc)i;
4) toString(): Mostra uma string na tela com os atributos a e b na notação Complexa a+bi;
5) modulo(): retorna o modulo do número complexo que é dado por|a+bi|=√a^2 + b^2;
6) argumentoPrincipal(): retorna o ângulo formado pelo número complexo no plano de argand-gauss que é dado pela fórmula θ = tan−1(b/a). */

public class Teste {

	public static void main(String[] args) {
			
		Complexo a = new Complexo(2.0, 3.0, 3.0, 4.0);
		Complexo b = new Complexo(3.0, 6.0, 5.0, 10.0);
		
		a.soma(); //(2,0 + 3,0i) + (3,0 + 4,0i) = (5,0 + 7,0i)
		b.multiplica(); //(3,0 + 6,0i) * (5,0 + 10,0i) = (15,0 + 60,0i)
		
		Complexo2 c = new Complexo2();
		Complexo2 d = new Complexo2(7.8, -9.1);
		Complexo2 e = new Complexo2(4.5, 6.7);
		
		System.out.println(c); //(0.0 + 0.0i)
		System.out.println(d); //(7.8 + -9.1i)
		System.out.println(e); ////(4.5 + 6.7i)
		System.out.println(Complexo2.soma(d, e)); //(12.3 + -2.4i)
		System.out.println(Complexo2.multiplica(d, e));	//(35.1 + -60.97i)
	}
}