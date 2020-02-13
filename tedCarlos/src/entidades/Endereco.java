package entidades;

public class Endereco {

	private String rua;
	private String cidade;
	private Integer numero;
	private Integer cep;

	public Endereco() {
	}

	public Endereco(String rua, String cidade, Integer numero, Integer cep) {
		this.rua = rua;
		this.cidade = cidade;
		this.numero = numero;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	

}
