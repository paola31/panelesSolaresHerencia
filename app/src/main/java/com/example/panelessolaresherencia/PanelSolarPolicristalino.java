package com.example.panelessolaresherencia;

public class PanelSolarPolicristalino extends PanelSolar{
    public PanelSolarPolicristalino(double eficiencia) {
        super("Policristalino", eficiencia);
    }

    @Override
    public String generarEnergia(double horasDeSol) {
        double energiaGenerada = horasDeSol * eficiencia * 0.9;
        return "Genera " + energiaGenerada + " kWH en " + horasDeSol + " horas de sol (ENERYPRO)";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "ENERYPRO";
    }
}
