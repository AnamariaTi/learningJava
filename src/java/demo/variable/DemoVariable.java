package java.demo.variable;

public class DemoVariable {
    public static void main(String[] args) {


//commentaire en une ligne

    /*
    commentaire
    en plusieurs
    lignes
     */

        //Déclaration et Initialisation de variables
        String nom = "Kimtsaris", prenom = "Alexandre";

        //Types primitifs - les seuls qui ne contiennt pas de ref à des objets


        //Nombres entiers


        //1 octet =>max :127, min : -126
        byte tresPetitEntier = 127;

        //2 octets => max : 32767, min :-32766
        short petitEntier = 32_767;

        //4 octets => max : ~ 2 millards , min : ~ 2 millards
        int entier = 2_000_000_000;

        //8octets =>max : enormement , min : -en
        long grandEntier = 5_000_000_000L;


        // ecriture binaire => 255
        entier = 0b11111111;
        // ecriture octale => 255
        entier = 0377;
        // ecriture hexadecimale => 255
        entier = 0xFF;


        // Nombres réels
        float reel = 0.5F;          // 4 octets
        double reelPrecis = 0.9;    // 8 octets

        // Autres
        boolean bool = false; // ou true // ~1bit
        char caractere = 'a'; // 2 octets
        caractere = 97; // les caractères sont en réalité stockés en tant que nombres


        // Constantes:
        final int TAUX_TVA = 21;


        // Conversion
        entier = Integer.MAX_VALUE;
        // 01111111 11111111 11111111 11111111
        petitEntier = (short) entier; // Type Casting Explicite (nécessaire car perte de données possible)
        //                   11111111 11111111
        entier = petitEntier; // Type Casting Implicite
        // 00000000 00000000 11111111 11111111


        entier = (int) reelPrecis;
        reelPrecis = entier;

        // Pour transforme de short en char, explicite nécessaire
        caractere = (char) petitEntier;


        //double converti = (double) "15"; // Impossible de convertir de cette manière

        //int converti = Integer.parseInt("quinze"); // erreur
        int converti = Integer.parseInt("15");

        System.out.println("15" + 1);       // 151
        System.out.println(converti + 1);   // 16

        //System.out.println("15" + 1 - 1); // impossible:
        //d'abord le + qui resulte en String puis - indisponible sur les String

        double convertiDouble = Double.parseDouble("15.5"); // Attention: avec un point
        System.out.println(convertiDouble); // 15.5

        boolean convertiBool = Boolean.parseBoolean("true");
        System.out.println(convertiBool);   // true

    }

}

