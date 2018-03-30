
package fr.m2i.Imcapp;

import fr.m2i.imc.model.ImcCalculator;
import java.util.Scanner;



/**
 *
 * @author Administrateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double poids, taille;
        Scanner saisie;
        ImcCalculator calculateurIMC;
       //interface utilisateur pour le calcul de l'IMC
        saisie = new Scanner(System.in);
        System.out.println("Vous voulez calculer votre IMC");
        System.out.println("Saisissez votre taille en mètre");
        taille = saisie.nextDouble();
        //instanciation du scanner
        
        System.out.println("Saisissez votre masse en kg");
        poids = saisie.nextDouble();
        calculateurIMC = new ImcCalculator(poids, taille);
        System.out.println("Votre IMC est : " + calculateurIMC.getImc());
        System.out.println(calculateurIMC.traduireIMC());
    }
    
}
