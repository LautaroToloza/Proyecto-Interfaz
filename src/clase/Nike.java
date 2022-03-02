package clase;

import InterfacesP.IMarcas;

public class Nike implements IMarcas {

    // Campos
    private String dueño;
    private double precioEmpresa;

    // Constructor
    public Nike(String dueño, double precioEmpresa) {
        this.dueño = dueño;
        this.precioEmpresa = precioEmpresa;

        // Getter y Setter
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public double getPrecioEmpresa() {
        return precioEmpresa;
    }

    public void setPrecioEmpresa(double precioEmpresa) {
        this.precioEmpresa = precioEmpresa;
    }
    // toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nike{");
        sb.append("Dueño=").append(dueño);
        sb.append(", Precio empresa=").append(precioEmpresa).append(" millones de dolares");
        sb.append('}');
        return sb.toString();
    }

    // Metodos abstractos
    @Override
    public void MuestraJugador() {
        System.out.println("El jugador más valioso de la compañia es Cristiano Ronaldo.");
    }

    @Override
    public void Fundacion() {
        System.out.println("Nike es una compañia estadounidense fundada el 25 de enero de 1964.");
    }

}
