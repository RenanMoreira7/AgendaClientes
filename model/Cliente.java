package model;

public abstract class Cliente {
    private String nome;
    private String contato;

    public Cliente(String nome, String contato){
        this.nome = nome;
        this.contato = contato;
    }
    public Cliente(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String toString(){
        return "Nome: " + this.nome + " | Contato: " + this.contato;
    }
    public abstract String getDoc();
}
