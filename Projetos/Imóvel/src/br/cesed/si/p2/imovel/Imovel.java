package br.cesed.si.p2.imovel;

public class Imovel {
	String tipo, imobiliaria;
	int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	
	Imovel(String tipo,String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrados, boolean piscina, boolean quadra,boolean elevador) {
		this.tipo = "Casa";
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	Imovel(String tipo,String imobiliaria,int pavimentos,int pavimento, int quartos, int suites, int banheiros, int metrosQuadrados,
			boolean elevador,boolean piscina, boolean quadra) {
		this.tipo = "Apartamento";
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	double calculaPreco() {
		
		double preco = 0;
		preco += metrosQuadrados*5000;
		
		switch(tipo) {
		    case "Apartamento":
		    	if(pavimentos >= 5) {
		    		preco+=(2000*pavimentos)-8000;
		    	}else {
		    		preco+=0;
		    	}
		    case "Casa":
		    	preco+=0;
		}
		
		if(elevador)
			preco+=2500;
		if(piscina)
			preco+=2500;
		if(quadra)
			preco+=2500;
		
		return preco;
	}
	
	public String toString() {
		String saida = "";
		saida += "Tipo: "+tipo+", Imobiliária: "+imobiliaria+", Andar: "+pavimentos+", Pavimento: "+pavimento;
		saida += ", Quartos: "+quartos+", Suítes: "+suites+", Banheiros: "+banheiros+", Metros Quadrados: "+metrosQuadrados;
		saida += ", Elevador: "+elevador+", Piscina: "+piscina+", Quadra: "+quadra;
		saida += ", Preço: R$ "+calculaPreco();
		return saida;
	}
}
	

	
