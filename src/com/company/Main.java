import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        //On affiche un message pour demander le numéro de table puis on récupère le numéro dans la console
        System.out.println("Numéro de table ? ");
        int numTable = sc.nextInt();
        sc.nextLine();

        // on déclare toutes les variables utilisées
        int compteur = 0;
        int quantité = 0;
        String produit = "";
        float prix = 0;
        boolean platSupp = true;
        float sousTotal = 0;
        ArrayList total = new ArrayList();

        // on commence la boucle : tant que platSupp est vérifié, la boucle se répète
        while (platSupp) {
            // On demande le produit
            System.out.println("Entrez le libellé produit : ");
            produit = sc.nextLine();

            // On demande la quantité
            System.out.println("Quantité ? : ");
            quantité = sc.nextInt();
            sc.nextLine();

            // On demande le prix unitaire
            System.out.println("Prix unitaire ? ");
            prix = sc.nextFloat();

            // on fait le sous-total
            sousTotal = quantité*prix;
            System.out.println(sousTotal);
            total.add(sousTotal);

            // on demande s'il y a autre chose, c'est ici qu'on recommence la boucle si réponse true
            System.out.println("Un plat ? : ");
            platSupp = sc.nextBoolean();
            sc.nextLine();
                }

        // On vérifie le montant total
            System.out.println(total);
        if (sousTotal <= 0) {
            System.out.println("FATAL ERROR !!!!!");
        } else {
            // On affiche le résultat
            System.out.println("*************************************");
            System.out.println(produit + " -----------------> " + quantité + "      " + quantité*prix + " EUR");
            System.out.println("Le montant total pour la table " + " est de " + quantité * prix);
            System.out.println("Merci de votre visite.");
            System.out.println("*************************************");

        }
        // On ferme le scanner
        sc.close();
    }
}

