package Herencia;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil(4, "Toyota", "Corolla", 4, "Gasolina");
        Motocicleta moto = new Motocicleta(2, "Honda", "CBR500R", 500, "Deportivo");

        Propietario propietarioAuto = new Propietario("Juan", "Perez", auto);
        Propietario propietarioMoto = new Propietario("Maria", "Gomez", moto);

        propietarioAuto.mostrarInformacion();
        System.out.println();
        propietarioMoto.mostrarInformacion();
    }
}
