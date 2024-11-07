package com.Java21_Features.java_21_unmodifiable_ist;

import java.util.List;

public class UnmodifiableListExample {
    //============================Utilité : Crée des listes immuables plus facilement.====================================
    public static void main(String[] args) {
        // création d'une liste non modifiable
        List<String> list = List.of("Apple", "Banana", "Cherry");

        // ajoute d'un élément à la liste
        try {
            list.add("Durian"); // Erreur : UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur : La liste est non modifiable");
        }
        // Afficher la liste non modifiable
        System.out.println(list);
    }
}