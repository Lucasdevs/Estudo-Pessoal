package br.cesed.si.p2.basicos;

import java.util.Scanner;

public class Problema4 {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		// o -1 é pra remover a extremidade.
		
		if(num2<num) {
			System.out.println("Múltiplos:");
			while(num2<num-1) {
				num2+=1;
				int y= num2 % 4; 
				if (y == 0) {
					System.out.println(num2);
				}
			}
				
		}else if(num<num2) {
			System.out.println("Múltiplos:");
			while(num<num2-1) {
				num+=1;
				int x= num % 4; 
				if (x == 0) {
					System.out.println(num);
				}
			}
		}else {
			System.out.println("Múltiplos: 0");
		}
	}
}
			
			
			
