package main;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Departamento;
import entidades.Empresa;
import entidades.Endereco;
import entidades.Funcionario;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		Integer cnpj;

		System.out.println("Digite o nome da empresa: ");
		nome = sc.nextLine();

		System.out.println("Digite o CNPJ: ");
		cnpj = sc.nextInt();

		Empresa.EmpLIsta.add(new Empresa(nome, cnpj));
		System.out.println("========================X===========================");

		Integer id;
		String nomeFuncionario;
		String cargo;

		System.out.println("Digite o ID do funcionário: ");
		id = sc.nextInt();

		sc.nextLine();
		System.out.println("Digite o nome do funcionário: ");
		nomeFuncionario = sc.nextLine();

		System.out.println("Digite o cargo do funcionário: ");
		cargo = sc.nextLine();

		Funcionario.funLIsta.add(new Funcionario(id, nomeFuncionario, cargo));
		System.out.println("========================X===========================");

		String codigo;
		String nomeDepartamento;

		System.out.println("Digite o codigo do departamento: ");
		codigo = sc.nextLine();

		System.out.println("Digite o nome do departamento: ");
		nomeDepartamento = sc.nextLine();

		Departamento.depLIsta.add(new Departamento(codigo, nomeDepartamento));
		System.out.println("========================X===========================");

		System.out.print("Digite o id do funcionario: ");
		int funcionarioId = sc.nextInt();
		for (int n = 0; n < Funcionario.funLIsta.size(); n++) {
			if (Funcionario.funLIsta.get(n).getId().equals(funcionarioId)) {
				for (int i = 0; i < Funcionario.funLIsta.size(); i++) {
					System.out.println(Funcionario.funLIsta.get(i));
				}

			} else {
				System.out.println("Esse id não existe");
			}
		}

		System.out.println("========================X===========================");

		System.out.print("Digite o codigo do departamento: ");
		sc.nextLine();
		String codigoDpto = sc.nextLine();
		for (int n = 0; n < Departamento.depLIsta.size(); n++) {
			if (Departamento.depLIsta.get(n).getCodigo().equals(codigoDpto)) {
				for (int i = 0; i < Departamento.depLIsta.size(); i++) {
					System.out.println(Departamento.depLIsta.get(i));
				}

			} else {
				System.out.println("Codigo Insistente! ");
			}
		}

		System.out.println();
		System.out.print("Digite o id do funcionario para excluilo: ");
		int removeFuncionario = sc.nextInt();
		sc.nextLine();

		for (int n = 0; n < Funcionario.funLIsta.size(); n++) {
			if (Funcionario.funLIsta.get(n).getId().equals(removeFuncionario)) {
				Funcionario.funLIsta.clear();
				System.out.println("O funcionario foi excluido com sucesso! ");

			} else {
				System.out.println("ID Inexistente! ");
			}
		}

		System.out.println();
		System.out.print("Digite o codigo do departamento para excluilo: ");
		String removeDpto = sc.nextLine();

		for (int n = 0; n < Departamento.depLIsta.size(); n++) {
			if (Departamento.depLIsta.get(n).getCodigo().equals(removeDpto)) {
				Departamento.depLIsta.clear();
				System.out.println("O departamento foi excluido com sucesso!");
			} else {
				System.out.println("Codigo Insistente! ");
			}
		}

		sc.close();

	}

}
