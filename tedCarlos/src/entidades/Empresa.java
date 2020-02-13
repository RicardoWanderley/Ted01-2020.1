package entidades;

import java.util.ArrayList;

public class Empresa extends Endereco {
	
	private Departamento dep;
	private String nome;
	private Integer cnpj;
	
	public static ArrayList<Empresa> EmpLIsta = new ArrayList<>();


	public Empresa() {
		super();
	}

	public Empresa(String nome, Integer cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getDep() {
		return dep.getNome();
	}

	public void setDep(String dep) {
		this.dep.setNome(dep);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + "]";
	}

	
	
	

}
