package com.example.panelessolaresherencia;

public class PanelSolar {

    protected String tipo;
    protected double eficiencia;


    public PanelSolar(String tipo, double eficiencia) {
        this.tipo = tipo;
        this.eficiencia = eficiencia;
    }

    public String generarEnergia(double horasDeSol) {
        //Método genérico será sobreescrito por las subclases.
        double energiaGenerada = horasDeSol * eficiencia;
        return "Genera " + energiaGenerada + " kWH | " + horasDeSol + " horas de sol";
    }

    public String getInfo() {
        return "Tipo " + tipo + " eficiencia " + eficiencia + "%";
    }
}
