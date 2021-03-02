import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // On affiche un message pour demander le numéro de table puis on récupère le numéro dans la console
        System.out.println("Numéro de table ? ");
        int numTable = sc.nextInt();

        // On demande le produit
        System.out.println("Produit ? : ");
        String produit = sc.nextLine();
        sc.nextLine();

        // On demande la quantité
        System.out.println("Quantité ? : ");
        int quantité = sc.nextInt();
        sc.nextLine();

        // On demande le prix unitaire
        System.out.println("Prix unitaire ? ");
        float prix = sc.nextFloat();

        // On demande si autre chose
        System.out.println("Autre chose ? : ");
        Boolean autrechose = sc.nextBoolean();
        sc.nextLine();


        // On vérifie le montant total
        if (quantité*prix <= 0) {
            System.out.println("FATAL ERROR !!!!!");
        } else {
            // On affiche le résultat
            System.out.println("Le montant total pour la table " + numTable + " est de " + quantité*prix + ". Merci de votre visite.");
        }

        // On ferme le scanner
        sc.close();
    }
}
