package model;

public class ClientePJ extends Cliente{
    private String CNPJ;
    private String razaoSocial;

    public ClientePJ(String nome, String contato, String cnpj, String razaoSocial) {
        super(nome, contato);
        this.CNPJ = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public ClientePJ(){
        super();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString(){
        return super.toString() + " | CNPJ: " + this.getCNPJ() + " | Razão Social: " + this.getRazaoSocial() + " | Tipo cliente: PJ" ;
    }

    @Override
    public String getDoc(){
        return CNPJ;
    }
}
