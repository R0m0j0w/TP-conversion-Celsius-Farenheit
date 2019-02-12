package com.company.romz;

import java.util.Scanner;

class Interaction {

    static void FarOrCel(){
        Scanner tempChoice = new Scanner(System.in);
        Scanner farOrCelChoice = new Scanner(System.in);
        int temp , choice ;

        System.out.println("Choisissez le mode de conversion :\n 1- Convertisseur Celsius - Farenheit \n 2- Convertisseur Farenheit - Celsius");
        choice = farOrCelChoice.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Vous avez choisi le convertisseur Celsius vers Farenheit , \n veuillez saisir une temperature : ");
                temp = tempChoice.nextInt();
                Converter celToFar = new Converter();
                celToFar.CelToFar(temp);
                break;

            case 2 :
                System.out.println("Vous avez choisi le convertisseur Celsius vers Farenheit , \n veuillez saisir une temperature : ");
                temp = tempChoice.nextInt();
                Converter farToCel = new Converter();
                farToCel.FarToCel(temp);
                break;

            default:
                System.out.println("Veuillez taper 1 ou 2 pour faire votre choix.");
        }
    }

      void RunAgain(){
        int answer;
        do
        {
            Scanner runAgain = new Scanner(System.in);
            System.out.println("Souhaitez vous recommencer ? \n 1 - Oui. \n 2 - Non.");
            answer = runAgain.nextInt();

            if (answer == 1)
                FarOrCel();
        }
        while(answer < 1 || answer > 2);

    }
}
