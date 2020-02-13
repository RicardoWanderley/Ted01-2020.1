package entidades;

import java.util.ArrayList;

public class Funcionario extends Endereco {

	private Integer id;
	private String nome;
	private String cargo;

	public static ArrayList<Funcionario> funLIsta = new ArrayList<>();

	public Funcionario() {
		super();
	}
	

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}


	public Funcionario(Integer id, String nome, String cargo) {

		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cargo=" + cargo + "]";
	}

}
