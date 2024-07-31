package com.example.panelessolaresherencia;

public class PanelSolarMonocristalino extends PanelSolar
{
    public  PanelSolarMonocristalino(double eficiencia)
    {
        super("Monocritsalino", eficiencia);
    }

    @Override
    public String generarEnergia(double horasDeSol)
    {
        double energiaGenerada = horasDeSol * eficiencia *1.1;
        return "Genera" + energiaGenerada + "KWH en " + horasDeSol + "horas de sol (CEPANEL)";
    }
 @Override
    public String getInfo()
 {
     return super.getInfo() + "CEPANEL";
 }
}
