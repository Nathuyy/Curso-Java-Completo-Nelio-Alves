package enumeracoes;

public class Pessoa {

    private String nome;
    private String cpf;
    private StatusCivil statusCivil;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public StatusCivil getStatusCivil() {
        return statusCivil;
    }

    public void setStatusCivil(StatusCivil statusCivil) {
        this.statusCivil = statusCivil;
    }

    public Pessoa(String nome, String cpf, StatusCivil statusCivil) {
        this.nome = nome;
        this.cpf = cpf;
        this.statusCivil = statusCivil;
    }
}
