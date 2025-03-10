package projeto2;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Digite o primeiro parâmetro: ");
	    int parametro1 = scanner.nextInt();
	    System.out.print("Digite o segundo parâmetro: ");
	    int parametro2 = scanner.nextInt();
	    scanner.close();

	    try {
	      contador(parametro1, parametro2);
	    } catch (ParametrosInvalidosException e) {
	      System.out.println("O primeiro parâmetro deve ser menor que o segundo");
	    }    
	}
	
	public static void contador(int parametro1, int parametro2) throws ParametrosInvalidosException {
	    int contador = parametro2 - parametro1;

	    if (parametro1 >= parametro2) {
	      throw new ParametrosInvalidosException();
	    }

	    for (int i = 1; i <= contador; i++) {
	      System.out.println("Contando " + i);
	    }
	}
}
