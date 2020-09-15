package br.cesed.si.p2.basicos;

import java.util.Scanner;

public class Problema5 {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		int cont2 = 0;
		while(cont<25) {
			int valor = entrada.nextInt();
			int val= valor%2;
			if(val == 0 && valor > 0) {
				cont2+=1;
			}
			cont+=1;
		}
		System.out.println("Numeros Pares e Positivos: "+cont2);
				
		}

	}

