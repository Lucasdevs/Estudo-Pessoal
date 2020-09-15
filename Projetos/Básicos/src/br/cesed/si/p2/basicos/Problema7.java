package br.cesed.si.p2.basicos;

import java.util.Scanner;

public class Problema7 {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		double media = 0;
		int cont = 0;
		int valor;
		do {
			valor = entrada.nextInt();
			int x = valor % 2;
			if(valor != 100 && x==0) {
				media+=valor;
				cont++;
			}
		}while(valor != 100);
		
		double resultado = media/cont;
		System.out.println("Média dos números pares: "+resultado);
				
		}
		
	}