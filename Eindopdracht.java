import java.util.Scanner;

/*
 * Programmeren 5a - Eindopdracht
 * TINPRO025A
 * 
 * Teamleden:
 *  -   Hidde-Jan Daniëls (0943798)
 *  -   Clarence Lurfs (1027668) 
 *  -   Joseph N'Zi (1033268) 
 *  -   Thijs Dregmans (1024272) 
 * 
 * Laatst aangepast op: 29-10-2022
*/

public class Eindopdracht {
    
    public static void main(String[] args) {

        System.out.println("Dit is de eindopdracht van programmeren 5a");
        System.out.println("Er worden hier auto's en bestelbussen gemaakt. Je kunt kiezen uit een aantal opties:");
        System.out.println();

        Dealer onzeDealerInDeBuurt = new Dealer();
        // print de mogelijkheden
        onzeDealerInDeBuurt.getOpties();

        int optieNr = -1;

        try{
            Scanner scanner = new Scanner(System.in);
            String output = scanner.nextLine();
            optieNr = Integer.parseInt(output);
            scanner.close();
        }
        catch(NumberFormatException e){
            System.out.println("Uw gekozen nummer is te groot. Uw nummer moet tussen de 0 en 3 zijn");
        }

        Vervoermiddel jouwVervoermiddel = onzeDealerInDeBuurt.getVervoermiddel(optieNr);
        if(jouwVervoermiddel != null){
            System.out.println("U koos het volgende vervoermiddel:");
            jouwVervoermiddel.printKenmerken();
        }
        else{
            System.out.println("Uw keuze bestaat niet");
        }
    }
}
