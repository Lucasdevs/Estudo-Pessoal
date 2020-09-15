package br.cesed.si.p2.basicos;

import java.util.Scanner;

public class Problema3 {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.next();
		double preço = entrada.nextDouble();
		
		if(preço>0 && preço<100) {
			preço*=0.95;
			System.out.println("Nome: "+nome);
			System.out.println("Preço: R$ "+preço);
		}else if(preço>=100 && preço<500 ){
			preço*=0.90;
			System.out.println("Nome: "+nome);
			System.out.println("Preço: R$ "+preço);	
		}else {
			preço*=0.85;
			System.out.println("Nome: "+nome);
			System.out.println("Preço: R$ "+preço);	
		}
	}
}
