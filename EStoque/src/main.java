import java.util.Scanner;
public class main{



	public static void  main(String[] args) {




		estoque_produtos estoque = new estoque_produtos();

		Scanner sc=new Scanner(System.in);
		boolean sair =false;

		while (!sair) {
			System.out.println("Escolha uma opcao: ");
			System.out.println("1 - Adicionar Produto");
			System.out.println("2 - Remover Produto");
			System.out.println("3 - Listar Estoque");
			System.out.println("4 - Consultar Produto");
			System.out.println("0 - SAIR");
			int escolha =sc.nextInt();
			sc.nextLine();
			switch (escolha) {
			case 1:
				
				System.out.println("Qual produto voce quer adicionar? ");
                String produto = sc.nextLine();
                System.out.println("Quantidade: ");
                int quantidade = sc.nextInt();
                estoque.adicionarProduto(produto, quantidade);
                break;
				
				
			case 2:
				System.out.println("Qual produto voce quer remover? ");
                String produto2 = sc.nextLine();
                System.out.println("Quantidade: ");
                int quantidade2 = sc.nextInt();
                estoque.removerProduto(produto2, quantidade2);
               
				break;
			case 3:
				estoque.listarProdutos();
				break;
			case 4:
			    System.out.println("Qual produto voce quer checar? ");
			    String produto3 = sc.nextLine();
			    int quantidadeProduto3 = estoque.consultarQuantidade(produto3);
			    System.out.println("Quantidade de " + produto3 + " no estoque: " + quantidadeProduto3);
			    break;

			case 0:
				sair = true;
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida.");
			}
			System.out.println("------------------------------------");
		}
		sc.close();
	}




}