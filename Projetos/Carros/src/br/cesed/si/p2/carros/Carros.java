package br.cesed.si.p2.carros;

public class Carros {
	
	String nome,marca,cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	Carros(String nome,String marca,double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.cor = "branca";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		
	}
	
	Carros(String nome,String marca,String cor,double precoBase,int portas,boolean vidroEletrico,boolean arCondicionado,
			boolean cambioAutomatico,boolean direcaoEletrica){
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
	}
	
	Carros(){
		
	}
	
	double calculaPreco() {
		
		double preco = precoBase;
		
		// alguns carros não informavam a cor.
		switch(cor) {
		    case "branca": preco+=0;
		    case "azul": preco+=0;
		    case "vermelha": preco+=0;
		    case "preta": preco+=0;
		    case"desconhecida":preco+=0;
		    default: preco += 1000;
		}
		
		if(vidroEletrico)
			preco+=1250;
		if(arCondicionado)
			preco+=1250;
		if(cambioAutomatico)
			preco+=1250;
		if(direcaoEletrica)
			preco+=1250;
		
		return preco;
	}
	
	public String toString() {
		String saida = "";
		saida += "Nome: "+nome+", Marca: "+marca+", Cor: "+cor+", Portas: "+portas+", Vidro Elétrico: "+vidroEletrico+", Ar Condicionado: "+arCondicionado;
		saida += ", Câmbio automático: "+cambioAutomatico+", Direção Elétrica: "+direcaoEletrica+", Preço: R$ "+calculaPreco();
		return saida;
	}
}
