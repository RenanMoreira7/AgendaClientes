package test;

import controller.Agenda;
import model.Cliente;
import model.ClientePF;
import model.Pedido;
import model.Produto;

import java.util.Scanner;
public class AgendaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda(); // Sua classe que gerencia a lista e os cadastros

        int opcao = -1; // Variável para controlar a escolha do usuário

        do {
            System.out.println("\n--- MENU DO CRM ---");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Criar Pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer do Enter logo após ler a opção numérica!

            switch (opcao) {
                case 1:
                    agenda.cadastrarClientes();
                    break;
                case 2:
                    // Exemplo iterando sobre a lista retornada por listarClientes()
                    System.out.println("\n--- LISTA DE CLIENTES ---");
                    for (Object c : agenda.listarClientes()) {
                        System.out.println(c); // Chama automaticamente o toString() de cada cliente
                    }
                    break;
                case 3:
                    System.out.print("Digite o CPF/CNPJ do cliente: ");
                    String doc = input.nextLine();

                    Cliente clienteEncontrado = agenda.buscarClientes(doc);

                    if (clienteEncontrado != null) {
                        System.out.println("Cliente encontrado: " + clienteEncontrado.getNome());

                        Pedido pedido = new Pedido(clienteEncontrado);
                        System.out.print("Nome do produto: ");
                        String prodNome = input.nextLine();

                        System.out.print("Preço do produto: ");
                        double prodPreco = input.nextDouble();
                        input.nextLine();

                        Produto produto = new Produto(prodNome, prodPreco);
                        pedido.addProdutos(produto);

                        System.out.println("Total do pedido: R$ " + pedido.calcTotal());
                    } else {
                        System.out.println("Erro: Nenhum cliente encontrado com o documento informado!");
                    }
                case 0:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0); // O loop repete até que a opção digitada seja 0

        input.close(); // Fecha o leitor ao encerrar o programa
    }
}
