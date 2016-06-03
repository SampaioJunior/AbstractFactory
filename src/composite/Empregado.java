package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Junior on 03/06/2016.
 */
public class Empregado {
    private String nome;
    private String departamento;
    private double salario;
    private List<Empregado> subordinados;

    public Empregado(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        subordinados = new ArrayList<Empregado>();

    }

    public void adiciona(Empregado empregado){
        subordinados.add(empregado);
    }

    public void remove(Empregado empregado){
        subordinados.remove(empregado);
    }

    public List<Empregado> getSubordinados(){
        return subordinados;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +'}';
    }
}
