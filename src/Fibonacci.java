import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int termo1 = 0, termo2 = 1, termo3 = 0;
		int valor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Consulta da Sequência de Fibonacci");
		System.out.println("Digite um número:");
		valor = leia.nextInt();
		
		while(valor > termo3) {
			termo3 = termo1 + termo2;
			termo1 = termo2;
			termo2 = termo3;	
		}
		
		if(valor == 0 || valor ==1) {
			System.out.println("O número pertence a sequência de Fibonacci.");
		} else if (valor == termo3) {
			System.out.println("O número pertence a sequência de Fibonacci.");
			
		} else {
			System.out.println("O número não pertence a sequência de Fibonacci.");
		}
		
		
	}
}
