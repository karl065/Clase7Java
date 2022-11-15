package Polimorfismo;

public class Ejecutable {

    public static void main(String[] args) {
        Animal objAnimal = new Animal();

        Animal objCerdo = new Cerdo();
        Animal objPerro = new Perro();

        objAnimal.animalSonido();
        objCerdo.animalSonido();
        objPerro.animalSonido();

    }

}
