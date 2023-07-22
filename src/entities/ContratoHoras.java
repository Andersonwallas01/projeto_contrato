package entities;

import java.util.Date;

public class ContratoHoras {
    private Date date;
    private Double valorhora;
    private Integer hora;

    public ContratoHoras(Date date, Double valorhora, Integer hora) {
        this.date = date;
        this.valorhora = valorhora;
        this.hora = hora;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorhora() {
        return valorhora;
    }

    public void setValorhora(Double valorhora) {
        this.valorhora = valorhora;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public double totalvalor(){
        return  valorhora * hora;
    }

}
