package model;

public class ClientePJ extends Cliente{
    private String CNPJ;
    private String RazaoSocial;

    public ClientePJ(String nome, String contato, String cnpj) {
        super(nome, contato);
        this.CNPJ = cnpj;
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
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        RazaoSocial = razaoSocial;
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
