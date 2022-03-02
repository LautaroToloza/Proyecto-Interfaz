package clase;

import InterfacesP.IMarcas;

public class Adidas implements IMarcas {

    // Campos
    private String dueño;
    private double precioEmpresa;

    // Constructor
    public Adidas(String dueño, double precioEmpresa) {
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
        sb.append("Adidas{");
        sb.append("Dueño=").append(dueño);
        sb.append(", Precio empresa=").append(precioEmpresa).append(" millones de dolares");
        sb.append('}');
        return sb.toString();
    }

    // Metodos abstractos
    @Override
    public void MuestraJugador() {
        System.out.println("El jugador más valioso de la compañia es Lionel Messi.");
    }

    @Override
    public void Fundacion() {
        System.out.println("Adidas es una compañia alemana fundada el 18 de agosto de 1949. ");
    }

}
