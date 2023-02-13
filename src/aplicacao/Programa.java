package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		Produto produto = new Produto(nome, preco);
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		produto.setQuantidade(quantidade);
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();
		System.out.print("Informe a quantidade de produtos a ser adicionada no estoque: ");
		quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();
		System.out.print("Informe a quantidade de produtos a ser removido do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		sc.close();
	}
}
