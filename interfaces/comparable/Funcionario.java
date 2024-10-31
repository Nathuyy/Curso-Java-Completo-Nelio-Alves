package interfaces.comparable;

public class Funcionario implements Comparable<Funcionario>{
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public Double getSalary() {
        return salario;
    }

    public void setSalary(Double salary) {
        this.salario = salary;
    }

    @Override
    public int compareTo(Funcionario funcionario) {
        return nome.compareTo(funcionario.getName());
    }
}
