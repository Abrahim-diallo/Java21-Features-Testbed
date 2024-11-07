package com.Java21_Features.pattern_matching_Records;

public class RecordPatternExample {

    // Définition du Record Point
    public record Point(int x, int y) {
        public boolean isOrigin() {
            return x == 0 && y == 0;
        }
        public boolean isOnXAxis() {
            return y == 0;
        }
        public boolean isOnYAxis() {
            return x == 0;
        }
    }

    static String describe(Object obj) {
        return switch (obj) {
            case Point point -> point.isOrigin() ? "Point origine"
                    : point.isOnXAxis() ? "Point sur l'axe X"
                    : point.isOnYAxis() ? "Point sur l'axe Y"
                    : "Point quelconque";
            case Double d -> d > 0 ? "Nombre positif" : d < 0 ? "Nombre négatif" : "Nombre nul";
            case String s -> s.isEmpty() ? "Chaîne vide"
                    : s.length() == 1 ? "Chaîne de longueur 1"
                    : "Chaîne de longueur > 1";
            default -> "Objet inconnu";
        };
    }

    public static void main(String[] args) {
        System.out.println(describe(new Point(0, 0)));  // Point origine
        System.out.println(describe(new Point(3, 0)));  // Point sur l'axe X
        System.out.println(describe(new Point(0, 4)));  // Point sur l'axe Y
        System.out.println(describe(new Point(3, 4)));  // Point quelconque
        System.out.println(describe(10.0));             // Nombre positif
        System.out.println(describe(-5.0));             // Nombre négatif
        System.out.println(describe(0.0));              // Nombre nul
        System.out.println(describe("Hello"));          // Chaîne de longueur > 1
        System.out.println(describe(""));               // Chaîne vide
        System.out.println(describe(new Object()));     // Objet inconnu
    }
}
