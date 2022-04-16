package trabalho;

public class Item {

	private int sequencial;
	private double qtd;
	private Produto prod;
	private Pedido ped;

	public Item(int sequencial, double qtd, Produto prod, Pedido ped) {
		this.sequencial = sequencial;
		this.qtd = qtd;
		this.prod = prod;
		this.ped = ped;
		ped.setValor((qtd) * (prod.getPreco()));
	}

	public int getSequencial() {
		return sequencial;
	}

	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}

	public double getQtd() {
		return qtd;
	}

	public void setQtd(double qtd) {
		this.qtd = qtd;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public Pedido getPed() {
		return ped;
	}

	public void setPed(Pedido ped) {
		this.ped = ped;
	}

	public String toString() {
		return "Item [ped=" + ped.getNumero() + ", prod=" + prod.getPreco() + ", qtd=" + qtd + ", sequencial=" + sequencial + "]";
	}

}
