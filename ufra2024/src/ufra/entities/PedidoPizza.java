package ufra.entities;

import java.util.Date;
import ufra.entities.enums.PizzaSabor;
import ufra.entities.enums.PizzaTamanho;

public class PedidoPizza {

	private PizzaTamanho tamanho;
	private PizzaSabor sabor;
	private Date moment;
	private double preco;
	private double precoFinal;
	private String tipo;
	private int quantidade = 1;
	private static final double MULT = 1.0;// fator multiplicador para eventuais reajustes.

	public PedidoPizza() {
	}

	public PedidoPizza(PizzaTamanho tamanho, PizzaSabor sabor,  Date moment, int quantidade) {

		this.tamanho = tamanho;
		this.sabor = sabor;
		this.moment = moment;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public PizzaTamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(PizzaTamanho tamanho) {
		this.tamanho = tamanho;
	}

	public PizzaSabor getSabor() {
		return sabor;
	}

	public void setSabor(PizzaSabor sabor) {
		this.sabor = sabor;
	}
	

	public Date getMoment() {
		return moment;
	}

	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}

	public void getQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getprecoFinal() {
		return precoFinal;
	}
	

	public double Preco(PizzaTamanho tamanho, int quantidade) {

		
		if (sabor == this.sabor.CALABRESA || sabor == this.sabor.MUSSARELA || sabor == this.sabor.MISTA) {
			if (tamanho == this.tamanho.FAMILIA) {
				this.preco = 60.0 * this.MULT;
			} else if (tamanho == this.tamanho.MEDIA) {
				 this.preco = 50.0 * this.MULT;
			} else if (tamanho == this.tamanho.PEQUENA) {
				 this.preco = 40.0 * this.MULT;
			} else if (tamanho == this.tamanho.INDIVIDUAL) {
				this.preco = 30.0 * this.MULT;
			}
			
		}
		
		return this.preco * this.quantidade;

	}
	
	public void precoFinal() {
		
		precoFinal += this.preco;
	}

	public String toString() {
		return "Data e Hora do Pedido: " + moment + "\nTamanho: " + tamanho + "\nSabor: " + sabor + "\n, Quantidade: " + quantidade + 
			   "\n Valor: " + preco ;
	}
	
	

	
	

}
