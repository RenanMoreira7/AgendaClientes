package model;

public class Produto {
    private static int countId = 1;

    private String nome;
    private double preco;
    private int id;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.id = countId++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
