package br.cesed.si.p2.prova;

public class Produto {
	//variável de classe
	private static double precoKm;
	
	//atributos
	private double preco;
	private String nome, vendedor;
	private Data dataVenda;
	private double kmEntrega;
	
	//getters
	public Data getDataVenda() {
		return dataVenda;
	}
	public double getKmEntrega() {
		return kmEntrega;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public static double getPrecoKm() {
		return precoKm;
	}
	public String getVendedor() {
		return vendedor;
	}
	
	//Construtor que recebe o preço, nome do produto, nome do vendedor, data de venda, e distância entre loja e destino da entrega em km (kmEntrega).

	public Produto(double preco, String nome, String vendedor, Data datavenda, double kmEntrega) {
		this.preco = preco;
		this.nome = nome;
		this.vendedor = vendedor;
		this.dataVenda = datavenda;
		this.kmEntrega = kmEntrega;
	}
	
	// função que calcula o custo total do produto (preço + frete)
	
	public double getCustoTotal() {
		double CustoTotal = 0;
		CustoTotal = preco+(precoKm*kmEntrega);
		return CustoTotal;
	}
	
	// função toString da classe Produto
	@Override
	public String toString() {
		String saida = " ";
		saida+= "Produto: "+nome+" Preço: "+preco+" Vendedor: "+vendedor+" Data e Venda: "+dataVenda+" Distância: "+kmEntrega;
		return saida;
	}


}
