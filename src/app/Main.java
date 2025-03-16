// src/app/Main.java
package app; // Declare o pacote da classe Main

import animal.Animal; // Importe a classe Animal
import animal.Cachorro; // Importe a classe Cachorro
import animal.Gato; // Importe a classe Gato

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da superclasse Animal
        Animal animalGenerico = new Animal("Animal Genérico", 5, "Som do animal");
        System.out.println("--- Testando a superclasse Animal ---");
        animalGenerico.emitirSom(); // Chama o método da superclasse
        animalGenerico.dormir();    // Chama outro método da superclasse
        System.out.println();

        // Criando um objeto da subclasse Cachorro
        Cachorro cachorro = new Cachorro("Rex", 3, "Pastor Alemão");
        System.out.println("--- Testando a subclasse Cachorro ---");
        cachorro.emitirSom(); // Chama o método sobrescrito
        cachorro.abanarRabo(); // Chama um método específico de Cachorro
        cachorro.dormir();    // Chama um método herdado da superclasse
        System.out.println();

        // Criando um objeto da subclasse Gato
        Gato gato = new Gato("Mimi", 2, "Preto");
        System.out.println("--- Testando a subclasse Gato ---");
        gato.emitirSom(); // Chama o método sobrescrito
        gato.arranhar();  // Chama um método específico de Gato
        gato.dormir();    // Chama um método herdado da superclasse
    }
}