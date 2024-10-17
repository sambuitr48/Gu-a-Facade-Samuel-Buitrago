package org.example;

// Clase principal que demuestra el uso del patrón Facade
public class Main {
    public static void main(String[] args) {
        // Se crea una instancia de la fachada CasaFacade
        CasaFacade casa = new CasaFacade();

        // Activar modo noche
        System.out.println("Activando modo noche:");
        casa.modoNoche();  // Llama al método para modo noche

        System.out.println();  // Espacio para separar la salida

        // Activar modo día
        System.out.println("Activando modo día:");
        casa.modoDia();  // Llama al método para modo día

        System.out.println();  // Espacio para separar la salida

        // Activar modo cine
        System.out.println("Activando modo cine:");
        casa.modoCine();  // Llama al método para modo cine
    }
}
