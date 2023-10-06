package com.cdaexo.Exo;

import java.util.Scanner;

public class Main {
    static private String choix;
    static private Boolean menu = true;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("TodoList : ");
        while(menu) {
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Afficher les tâches");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Supprimer une tâche");
            System.out.println("5. Quitter");
            choix = scanner.nextLine();
            switch(choix) {
                case "1":
                break;
                case "2":
                break;
                case "3":
                break;
                case "4":
                break;
                case "5":
                System.out.println("Enrevoir :) !");
                menu = false;
                break;
                default:
                System.out.println("Votre choix n'est pas valide, veuillez réessayez: ");
                break;
            }
        }

    }
}
