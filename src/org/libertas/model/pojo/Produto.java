package org.libertas.model.pojo;

public class Produto {
	
	private int idproduto;
	private String descricao;
	private String marca;
	private double precoCusto;
	private double precoVenda;
	private double saldo;
	
	public Produto() {
		this.idproduto = 0;
		this.descricao = "";
		this.marca = "";
		this.precoCusto = 0.0;
		this.precoVenda = 0.0;
		this.saldo = 0.0;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}
	
}
