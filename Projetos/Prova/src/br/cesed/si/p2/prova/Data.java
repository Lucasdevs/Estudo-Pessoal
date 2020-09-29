package br.cesed.si.p2.prova;

public class Data {
	//atributos privados
	private short dia, mes, ano;
	
	public Data(short dia, short mes, short ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	//getters
	public short getDia() {
		return dia;
	}
	
	public short getMes() {
		return mes;
	}
	
	public short getAno() {
		return ano;
	}
	// toString para classe data
	@Override
	public String toString() {
		String saida = this.getDia()+" / "+this.getMes()+" / "+this.getAno();
		return saida;
	}
}