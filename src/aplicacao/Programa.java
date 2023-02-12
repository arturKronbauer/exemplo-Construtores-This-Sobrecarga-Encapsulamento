package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em Estoque: ");
		produto.quantidade = sc.nextInt();
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();
		System.out.print("Informe a quantidade de produtos a ser adicionada no estoque: ");
		int quantidade = sc.nextInt();
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
