package teoria.ej142;

public class Animal {
    private String nombre;
    private double velocidad;
    private int cantidadPatas;
    private boolean puedeVolar;

    public Animal(String nombre, double velocidad, int cantidadPatas, boolean puedeVolar) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.cantidadPatas = cantidadPatas;
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return "Animal," +
                nombre +
                ", " + velocidad +
                ", " + cantidadPatas +
                ", " + puedeVolar ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
}
