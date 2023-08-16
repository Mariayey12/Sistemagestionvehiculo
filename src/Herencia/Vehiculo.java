package Herencia;

// Clase Herencia.Vehiculo (Clase base)
class Vehiculo {
    private int ruedas;
    private String marca;
    private String modelo;

    public Vehiculo(int ruedas, String marca, String modelo) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void obtenerInformacion() {
        System.out.println("Tipo de vehículo: Herencia.Vehiculo");
        System.out.println("Ruedas: " + ruedas);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

// Interfaz Herencia.Conducible
interface Conducible {
    void conducir();
}
