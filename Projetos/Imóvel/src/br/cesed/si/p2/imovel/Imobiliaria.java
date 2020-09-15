package br.cesed.si.p2.imovel;

public class Imobiliaria {
	public static void main(String[] args) {
		Imovel imovel1 = new Imovel("Casa","Falcão",3,1,2,120,true,false,false);
		Imovel imovel2 = new Imovel("Apartamento","Altaman",15,8,3,2,3,82,true,false,false);
		Imovel imovel3 = new Imovel("Casa","Altaman",4,2,3,240,true,true,true);
		Imovel imovel4 = new Imovel("Casa","Leblon",6,3,5,540,true,true,true);
		Imovel imovel5 = new Imovel("Apartamento","Alto Branco",3,2,2,1,2,60,true,true,false);
		System.out.println(imovel1);
		System.out.println();
		System.out.println(imovel2);
		System.out.println();
		System.out.println(imovel3);
		System.out.println();
		System.out.println(imovel4);
		System.out.println();
		System.out.println(imovel5);
		
	
	}

}
