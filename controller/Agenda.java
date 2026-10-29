package controller;

import exceptions.ClienteNaoEncontradoException;
import model.Cliente;
import model.ClientePF;
import model.ClientePJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void cadastrarClientes(){
        Scanner input = new Scanner(System.in);
        System.out.print("casdastrar Pesssoa Fisica(1) ou Pessoa Juridica(2)?");
        int opc = input.nextInt();
        if(opc == 1){
            input.nextLine();
            ClientePF clientePF = new ClientePF();

            System.out.print("Nome do cliente:");
            clientePF.setNome(input.nextLine());

            System.out.print("Contato do cliente:");
            clientePF.setContato(input.nextLine());

            System.out.print("CPF do cliente:");
            clientePF.setCPF(input.nextLine());

            addCliente(clientePF);
        }else if (opc == 2){
            input.nextLine();
            ClientePJ clientePJ = new ClientePJ();

            System.out.print("Nome da empresa:");
            clientePJ.setNome(input.nextLine());

            System.out.print("Contato da empresa:");
            clientePJ.setContato(input.nextLine());

            System.out.print("CNPJ da empresa:");
            clientePJ.setCNPJ(input.nextLine());

            System.out.print("Razão Social da empresa:");
            clientePJ.setRazaoSocial(input.nextLine());

            addCliente(clientePJ);
        }else{
            System.out.println("opção invalida");
        }
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes(){
        return clientes;
    }

    public Cliente buscarClientes(String doc){
        for(Cliente cliente : clientes){
            if(cliente.getDoc().equals(doc)){
                return cliente;
            }
        }
        return null;
    }
}
