package exercicio_2;

/* Implemente uma classe Lâmpada. Toda lâmpada possui um estado (on/off ). Sabe-se que as lâmpadas podem ter seu estado trocado (click do interruptor). Será necessário também uma funcionalidade para checar o estado atual da lâmpada. Uma lâmpada estraga após uma quantidade de clicks (o click não troca mais o estado deixando-a eternamente em off ) e esta depende da lâmpada. Implemente esta situação e seu teste. */

public class Teste {
	public static void main(String[] args) {
		Lampada a = new Lampada();
		System.out.println("A lâmpada está apagada agora.");
		a.clicked(); //acendeu
		a.clicked(); //apagou
		a.clicked(); //acendeu
		a.clicked(); //quebrou e apagou
		a.clicked(); //apagada
	}

}