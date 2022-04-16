package trabalho;

public class ClienteEspecial extends Cliente {
	
	private String area;

	
	
	public ClienteEspecial(String cpf, String nome, String endereco, String area) {
		super(cpf, nome, endereco);
		this.area = area;
	}
	
	public ClienteEspecial(String cpf, String nome, String area) {
		super(cpf, nome);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}


	
	
}
