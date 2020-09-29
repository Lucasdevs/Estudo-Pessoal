package br.cesed.si.p2.prova;


public class MercadoLivre {
	
	private Produto [] produtos;
	private static int qtdprodutos = 0;
	
	//Construtor
	public MercadoLivre(){
		this.produtos = new Produto[10];
	}
	//função que adiciona produto, checa se o array está totalmente preenchido, cria um novo array com o dobro do qtdprodutos se precisar 
	public void adicionarProduto(Produto x) {
		if( qtdprodutos == produtos.length) {
			Produto[] newprodutos = new Produto[2*produtos.length];
			for (int i = 0; i < newprodutos.length; i++) {
				newprodutos[i]=produtos[i];
			}
			this.produtos = newprodutos;
		}
	produtos[qtdprodutos] = x;
	qtdprodutos++;
	}
	
	// função que adiciona produto com atributos
	public void adicionarProduto(double preco, String nome, String vendedor, Data dataVenda, double kmEntrega) {
		adicionarProduto(new Produto(preco,nome,vendedor,dataVenda,kmEntrega));
		
	}
	
	//Função para retornar quantidade de produtos publicados no MercadoLivre
	
	public static int getQtdprodutos() {
		return qtdprodutos;
	}
	
	//Função que retorne todos os produtos vendidos por um mesmo vendedor:
	
	public Produto[] getProdutosVendedor(String vendedor) {
		int cont=0;
		for (Produto x : produtos) {
			if(x != null && x.getVendedor().equals(vendedor)) {
				cont++;
			}
		}
		if(cont>0) {
			Produto [] MesmoVendedor = new Produto[cont];
			int local = 0;
			for (Produto x : produtos) {
				if(x != null && x.getVendedor().equals(vendedor)) {
					MesmoVendedor[local]= x;
					local++;
				}
			}
			return MesmoVendedor;
		}
		else {
			return null;
		}
	}
	 //Função que retorne o custo agregado de todos os produtos vendidos
	
	public double getCustoProdutos() {
		double valorTotal = 0;
		for (Produto x : produtos) {
			valorTotal += x.getCustoTotal();
		}
		return valorTotal;
	}
	
	//Função que remova o produto anunciado mais antigo de um determinado vendedor
	
	public Produto removeProdutoMaisAntigo(String vendedor) {
		int ano= 0; int mes = 1; int dia = 1;
		Produto removido = null;
		
		for (int i = 0; i < qtdprodutos; i++) {
			if (produtos[i].getVendedor().equals(vendedor)) {
				 ano = produtos[i].getDataVenda().getAno();
				for (int j = 0; j < qtdprodutos; j++) {
					if (produtos[j].getDataVenda().getAno() < ano) {
						ano = produtos[j].getDataVenda().getAno();	
						break;
					}
						for (int n = 0; n < qtdprodutos; n++) {
							if (produtos[n].getVendedor().equals(vendedor) &&
								produtos[n].getDataVenda().getAno() == ano &&
								produtos[n].getDataVenda().getMes() == mes){
								break;
							 }else{
								 mes+=1;
							}
							for (int m = 0; m < qtdprodutos; m++) {
								if(produtos[m].getVendedor().equals(vendedor) &&
								produtos[m].getDataVenda().getAno() == ano &&
								produtos[m].getDataVenda().getMes() == mes &&
								produtos[m].getDataVenda().getDia() == dia) {
									break;
								
								}else {
									dia+=1;
								}
								for (int s = 0; s < qtdprodutos; s++) {
									if(produtos[s].getVendedor().equals(vendedor) &&
											produtos[s].getDataVenda().getAno() == ano &&
											produtos[s].getDataVenda().getMes() == mes &&
											produtos[s].getDataVenda().getDia() == dia) {
											break;
									}else {
										dia+=1;
								}
									for (int t = 0; t < qtdprodutos; t++) {
										if(produtos[s].getVendedor().equals(vendedor) &&
												produtos[s].getDataVenda().getAno() == ano &&
												produtos[s].getDataVenda().getMes() == mes &&
												produtos[s].getDataVenda().getDia() == dia ){
												removido = produtos[s];
												produtos[s] = null;
												break;
												}
										}
										this.qtdprodutos--;
										}
									}
								}
							}	 
						}
					}
	return removido;
			
	}
}



