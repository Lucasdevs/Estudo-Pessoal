package br.cesed.si.p2.carros;


public class Concessionaria {
	public static void main(String[] args) {
		Carros palio1 = new Carros("Pálio","Fiat",35000);
		Carros palio2 = new Carros("Pálio","Fiat","Prateado",35000,2,false,false,false,false);
		Carros civic = new Carros("Civic","Honda","Desconhecida",110000,4,true,true,true,true);
		Carros corolla = new Carros("Corolla","Toyota","Desconhecida",110000,4,true,true,false,true);
		Carros gol = new Carros("Gol","Volkswagen","Desconhecida",55000,4,true,true,true,true);
		
		System.out.println(palio1+"\n");
		System.out.println(palio2+"\n");
		System.out.println(civic+"\n");
		System.out.println(corolla+"\n");
		System.out.println(gol);
	}
		
}
