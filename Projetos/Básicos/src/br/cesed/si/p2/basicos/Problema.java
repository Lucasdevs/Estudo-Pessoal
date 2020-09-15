package br.cesed.si.p2.basicos;

import java.util.Scanner;

public class Problema{
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		double inicio = entrada.nextDouble();
		double inicio2 = entrada.nextDouble();
		
		if(inicio>inicio2) {
			System.out.println(inicio);
		}else {
			System.out.println(inicio2);
		}
		
		
	}
}
