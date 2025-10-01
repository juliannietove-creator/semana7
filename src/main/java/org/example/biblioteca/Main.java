package org.example.biblioteca;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de MaterialBiblioteca
        MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];

        // Crear instancias de cada tipo y guardarlas en el arreglo
        materiales[0] = new Libro("Don Quijote", "Miguel de Cervantes", 1605, "Novela");
        materiales[1] = new Revista("National Geographic", "National Geographic Society", 2023, 256);
        materiales[2] = new Tesis("Inteligencia Artificial", "Juan Pérez", 2022, "Universidad Politécnica");

        // Recorrer el arreglo y mostrar la información de cada material
        System.out.println("=== Materiales de la Biblioteca ===");
        for (MaterialBiblioteca material : materiales) {
            material.mostrarInfo();
            System.out.println("-----------------------------");
        }
    }
}
