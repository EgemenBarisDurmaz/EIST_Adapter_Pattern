package de.tum.in.ase.eist;

public class ThermoAdapter implements ThermoInterface {
    FahrenheitThermo thermo = new FahrenheitThermo();
    @Override
    public double getTempC() {
        return 0;
    }

}
