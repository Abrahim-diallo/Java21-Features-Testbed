package com.Java21_Features.sealed_interfaces;

import java.lang.ScopedValue;

public class ScopedValues {
    // Utilisation de ScopedValue: remplace l'usage de variables statiques et globales pour certaines utilisations multi-thread.
    // Il permet de définir une valeur dans une portée limitée et sécurisée, qui est isolée par thread.

    private static final ScopedValue<String> scope = ScopedValue.newInstance();

    public static void main(String[] args) {
        // Entrée dans la portée avec une valeur
        ScopedValue.where(scope, "Scoped Value").run(() -> {
            System.out.println("Scoped Value: " + scope.get());
        });

        // Vérifier si la valeur est encore accessible
        if (scope.isBound()) {
            System.out.println("En dehors de la portée : " + scope.get());
        } else {
            System.out.println("En dehors de la portée : aucune valeur définie.");
        }
    }
}
