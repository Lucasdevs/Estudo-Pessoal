package br.cesed.si.p2.basicos;

import java.util.Scanner;

public class Problema6 {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		int cont2 = 0;
		while(cont<50) {
			int valor = entrada.nextInt();
			int val= valor % 3;
			if(val == 0 ) {
				cont2+=valor;
			}
			cont+=1;
		}
		System.out.println("Soma dos Múltiplos de Três: "+cont2);
				
		}

	}