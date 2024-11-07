package com.Java21_Features.virtual_threads;

public class virtual_threads {
    public static void main(String[] args){
        // Créer un thread normal
        Thread threadNormal = new Thread(() -> {
            System.out.println("Thread normal exécuté");
        });
        // Démarrer le thread normal
        threadNormal.start();
        // Créer un thread virtuel
        Thread thread = Thread.startVirtualThread(() ->{
            System.out.println("Thread virtuel exécuté");
        });
    }

}
