package exercicio_5;

/* Implemente uma classe que modele um jogo de advinhação de números de 0 a 99. O jogo deve possuir um método para
sortear e outro que simule a advinhação. */

import java.util.Scanner;
import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		Jogo a = new Jogo();
                   
        Scanner input = new Scanner(System.in);
        
        Random gerarNumAleatorio = new Random();
        a.sorteado = gerarNumAleatorio.nextInt(100);
        System.out.println("Número entre 0 e 99 sorteado!");
        
        do{
            System.out.println("Tentativas: " + a.tentativas);
            
            System.out.print("Dê um chute: ");
            a.chute = input.nextInt();
            
            a.tentativas++;
            
            a.dica(a.chute, a.sorteado, a.tentativas);
            
        }while (a.chute != a.sorteado);
	}
}