package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();
    private int id;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void addProdutos(Produto produto) {
        produtos.add(produto);
    }

    public double calcTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}

