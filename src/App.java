// Clase base (superclase)
class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

// Clase derivada (subclase) Perro
class Perro extends Animal {
    String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    void mostrarInformacionPerro() {
        mostrarInformacion();
        System.out.println("Raza: " + raza);
    }
}

// Clase derivada (subclase) Gato
class Gato extends Animal {
    String pelaje;

    public Gato(String nombre, int edad, String pelaje) {
        super(nombre, edad);
        this.pelaje = pelaje;
    }

    void mostrarInformacionGato() {
        mostrarInformacion();
        System.out.println("Pelaje: " + pelaje);
    }
}

// Clase derivada (subclase) Ave
class Ave extends Animal {
    String especie;

    public Ave(String nombre, int edad, String especie) {
        super(nombre, edad);
        this.especie = especie;
    }

    void mostrarInformacionAve() {
        mostrarInformacion();
        System.out.println("Especie: " + especie);
    }
}

public class App {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Fido", 3 , "Golden Retriever");
        miPerro.mostrarInformacionPerro();

        Gato miGato = new Gato("Miau", 2 , "Siamés");
        miGato.mostrarInformacionGato();

        Ave miAve = new Ave("Lola", 1, "Cisne");
        miAve.mostrarInformacionAve();
    }
}