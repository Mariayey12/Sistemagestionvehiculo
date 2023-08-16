package Herencia;
// Clase Automovil (Derivada de Vehiculo e implementando Conducible)
class Automovil extends Vehiculo implements Conducible {
    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil(int ruedas, String marca, String modelo, int numeroPuertas, String tipoCombustible) {
        super(ruedas, marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Tipo de vehículo: Automovil");
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

    @Override
    public void conducir() {
        System.out.println("El automóvil está en movimiento.");
    }
}
