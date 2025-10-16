package com.demo;
import com.example.App;
public class SmokeTest {
    public static void main(String[] args) {
        try {
            System.out.println("Démarrage de l'application...");
            App.main(args);  // lance l'application
            System.out.println("Smoke test OK !");
        } catch (Exception e) {
            System.err.println("Smoke test échoué !");
            e.printStackTrace();
            System.exit(1); // échoue le pipeline si erreur
        }
    }
}
