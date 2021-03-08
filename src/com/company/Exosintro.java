package com.company;

import java.util.Scanner;

public class Exosintro {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);
        //exo1(sc);
        //exo2(sc);
        //exo3(sc);
        //exo4(sc);

        int nexo = -1;
        while (nexo != 0) {
            //pour initier un switch case :

            nexo = readInt(sc, "Bienvenue dans l'interface utilisateur Sheikah. Les exercices proposés sont les suivants :\n1: Déclarons quelques variables \n2: Utilisons des opérateurs \n3: Algorithmes \n4: Affichage \nVeuillez indiquer le numéro de l'exercice souhaité :");

            switch (nexo) {
                case 0: {
                    System.out.println("cliquez sur 0");
                    break;
                }
                case 1: {
                    exo1(sc);
                    break;
                }
                case 2: {
                    exo2(sc);
                    break;
                }
                case 3: {
                    exo3(sc);
                    break;
                }
                case 4: {
                    exo4(sc);
                    break;
                }
                default: {
                    System.out.println("erreur");
                    break;
                }
            } break;
        }
    }

    private static int readInt (Scanner sc,String message) {
        boolean isValid = false;
        int rest=0;
        while (!isValid) {
            System.out.println(message);
            if (sc.hasNextInt()) {
                isValid = true;
                rest = sc.nextInt();
            }
            else {
                System.err.println("Merci d'indiquer une valeur valide !");
            sc.nextLine();}
        }
        return rest;
    }

    private static void exo1(Scanner sc) {
        //Etape 1 : Déclarons quelques variables

        System.out.println("Quel est votre prénom ?");
        String prénom = sc.nextLine();
        sc.nextLine();

        System.out.println("Quel est votre nom ?");
        String nom = sc.nextLine();

        System.out.println("Quel est votre âge ?");
        int âge = sc.nextInt();
        sc.nextLine();

        System.out.println("Quelle est votre taille ?");
        int tailleEnCm = sc.nextInt();
        sc.nextLine();

        System.out.println("Je m'appelle " + prénom + " " + nom + ". J'ai " + âge + " ans et je mesure " + tailleEnCm + " cm.");
    }

    private static void exo2(Scanner sc) {
        //Etape 2 : Utilisons des opérateurs

        //Exercice 2.1 : calcul de prix TTC
        System.out.println("Indiquez le prix H.T :");
        double prixHT = sc.nextDouble();
        sc.nextLine();

        System.out.println("Quel est le taux de TVA ? (5,5 ou 19,6)");
        double tauxTVA = sc.nextDouble();
        sc.nextLine();

        double prixTTC = prixHT * (1 + tauxTVA / 100);

        System.out.println("Le prix TTC est de " + String.format("%.2f€", prixTTC));


        //Exercice 2.2 : calcul composé
        System.out.println("Quelle année souhaitez-vous tester ?");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
            System.out.println("C'est une année bissextile !");
        } else {
            System.out.println("Ce n'est pas une année bissextile !");
        }
    }

    private static void exo3(Scanner sc) {
        //Etape 3 : Algorithmes

        System.out.println("Quel est le nombre dont vous souhaitez connaître la factorielle ?");
        int nombre = sc.nextInt();
        int factorielle = 1;
        for (int i = 1; i < nombre; i++) {
            factorielle = factorielle * i;
        }
        System.out.println("La factorielle de " + nombre + " est " + factorielle);
    }

    private static void exo4(Scanner sc) {
        //Etape 3.3 : Affichage

        System.out.println("Quelle est la longueur de la règle à afficher ? (on attend un nombre entier) ");
        int nombre = sc.nextInt();

        String tirets = sc.nextLine();

        System.out.print("[");
        for (int i = 1; i <= nombre; i++) {
            if (i % 5 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.print("]");
            }
}
