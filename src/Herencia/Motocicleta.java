package Herencia;

// Clase Motocicleta (Derivada de Vehiculo e implementando Conducible)
class Motocicleta extends Vehiculo implements Conducible {
    private int cilindrada;
    private String tipoManejo;

    public Motocicleta(int ruedas, String marca, String modelo, int cilindrada, String tipoManejo) {
        super(ruedas, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoManejo = tipoManejo;
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Tipo de vehículo: Motocicleta");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipo de manejo: " + tipoManejo);
    }

    @Override
    public void conducir() {
        System.out.println("La motocicleta está en movimiento.");
    }
}
