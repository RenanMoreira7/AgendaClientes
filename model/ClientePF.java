package model;

public class ClientePF extends Cliente{
    private String CPF;

    public ClientePF(String nome, String contato, String cpf){
        super(nome, contato);
        this.CPF = cpf;
    }
    public ClientePF(){
        super();
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString(){
        return super.toString() + " |  CPF: " + this.getCPF() + " | Tipo cliente: PF";
    }

    @Override
    public String getDoc(){
        return this.CPF;
    }
}
