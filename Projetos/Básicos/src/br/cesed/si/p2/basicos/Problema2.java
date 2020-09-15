package br.cesed.si.p2.basicos;

import java.util.Scanner;

public class Problema2 {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		double num = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		double num3 = entrada.nextDouble();
		
		System.out.println ("Média: "+(num+num2+num3)/3);
	}

}