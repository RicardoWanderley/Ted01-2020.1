package entidades;

import java.util.ArrayList;

public class Departamento extends Empresa {
	private Funcionario fun = new Funcionario();
	private String codigo;
	private String nome;
	
	public static ArrayList<Departamento> depLIsta = new ArrayList<>();

	
	public Departamento() {
		super();
	}

	public Departamento(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Funcionario getFun() {
		return fun;
	}

	public void setFun(Funcionario fun) {
		this.fun = fun;
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

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nome=" + nome + "]";
	}

}
