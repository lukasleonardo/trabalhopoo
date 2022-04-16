package trabalho;

public class Produto {

	private String codigo;
	private String nome;
	private double preco;
	private double qtdestoque;

	public Produto(String codigo, String nome, double preco, double qtdestoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.qtdestoque = qtdestoque;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtdestoque() {
		return qtdestoque;
	}

	public void setQtdestoque(double qtdestoque) {
		this.qtdestoque = qtdestoque;
	}

	public double AdicionaQtdEstoque(double quantidade) {

		qtdestoque += quantidade;

		return qtdestoque;
	}

	public double DiminuiQtdEstoque(double quantidade) {
		qtdestoque -= quantidade;
		return qtdestoque;
	}

	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", qtdestoque=" + qtdestoque + "]";
	}

}
