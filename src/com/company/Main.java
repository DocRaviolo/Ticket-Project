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
        ArrayList totalProduits = new ArrayList();
        ArrayList totalQuantités = new ArrayList();
        ArrayList<Float> total = new ArrayList<Float>();
        float sum = 0;

        // on commence la boucle : tant que platSupp est vérifié, la boucle se répète
        while (platSupp) {
            // On demande le produit consommé
            System.out.println("Entrez le libellé produit : ");
            produit = sc.nextLine();
            totalProduits.add(produit);

            // On demande la quantité
            System.out.println("Quantité ? : ");
            quantité = sc.nextInt();
            sc.nextLine();
            totalQuantités.add(quantité);

            // On demande le prix unitaire
            System.out.println("Prix unitaire ? ");
            prix = sc.nextFloat();

            // Calcul du sous-total
            sousTotal = quantité * prix;
            //System.out.println(sousTotal);
            total.add(sousTotal);

            // on demande s'il y a autre chose, c'est ici qu'on recommence la boucle si réponse true
            System.out.println("Un plat ? : ");
            platSupp = sc.nextBoolean();
            sc.nextLine();
        }

        //j'imprime les totaux de chaque liste pour vérification
        //System.out.println(total);
        //System.out.println(totalQuantités);
        //System.out.println(totalProduits);

        //calcul de la somme Totale
        for (int i = 0; i < totalProduits.size(); i++) {
            sum += total.get(i);
            //   System.out.println(sum);
        }

        //Edition de la facture
        // On vérifie le montant total
        if (sousTotal <= 0) {
            System.out.println("FATAL ERROR !!!!!");
        } else {
            // On affiche le résultat
            System.out.println("*************** FACTURE *******************");
            System.out.println(" ");
            System.out.println("Table n° " + numTable);
            System.out.println(" ");
            //boucle pour printer le récap des produits, quantités et prix total
            for (int i = 0; i < totalProduits.size(); i++) {
                System.out.println(totalProduits.get(i) + " --------------> " + totalQuantités.get(i) + "    " + total.get(i));
            }
            System.out.println(" ");
            System.out.println("TOTAL ----------------> " + sum + " EUR");
            System.out.println(" ");
            System.out.println("Merci de votre visite.");
            System.out.println(" ");
            System.out.println("*************************************");

        }
        // On ferme le scanner
        sc.close();
    }
}

