package entities;

import ententies.enums.Nivel_Trabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private Nivel_Trabalhador nivel;
    private double base_salario;

    private Departamento departamento;
    private List<ContratoHoras> contratos = new ArrayList<>();


    public Trabalhador() {

    }

    public Trabalhador(String nome, Nivel_Trabalhador nivel, double base_salario, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.base_salario = base_salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nivel_Trabalhador getNivel() {
        return nivel;
    }

    public void setNivel(Nivel_Trabalhador nivel) {
        this.nivel = nivel;
    }

    public double getBase_salario() {
        return base_salario;
    }

    public void setBase_salario(double base_salario) {
        this.base_salario = base_salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHoras> getContratos() {
        return contratos;
    }


    public void addcontrato(ContratoHoras contrato) {
        contratos.add(contrato);
    }

    public void removecontrato(ContratoHoras contrato) {
        contratos.remove(contrato);
    }

    public Double renda(int ano, int mes) {
        double sum = base_salario;
        Calendar cal = Calendar.getInstance();
        for (ContratoHoras c : contratos) {
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                sum += c.totalvalor();
            }


        }

        return sum;
    }
}