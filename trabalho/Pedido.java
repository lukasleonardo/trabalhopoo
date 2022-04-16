package trabalho;

import java.util.ArrayList;
import java.util.List;
import trabalho.Item;
import trabalho.Produto;

public class Pedido {

	private String numero;
	private String data;
	private Cliente cli;
	private StatusPedido situacao;
	private double valor;
	private List<Item> itens = new ArrayList<Item>();

	public Pedido(String numero, String data, Cliente cli) {
		this.numero = numero;
		this.data = data;
		this.cli = cli;
		this.situacao = StatusPedido.ANALISE;
		this.valor = 0.0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public StatusPedido getSituacao() {
		return situacao;
	}

	public void setSituacao(StatusPedido situacao) {
		this.situacao = situacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor += valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(Item item) {
		this.itens.add(item);

	}

	public String toString() {
		return "Pedido [cli=" + cli.getNome() + ", data=" + data + ", itens=" + itens + ", numero=" + numero + ", situacao="
				+ situacao + ", valor=" + valor + "]";
	}

}
