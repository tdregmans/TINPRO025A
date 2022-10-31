
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

public class Dealer {

    private Fabriek autoFabriek;
    private Fabriek bestelbusFabriek;


    Dealer() {
        this.autoFabriek = new AutoFabriek();
        this.bestelbusFabriek = new BestelbusFabriek();
    }

    // Er zijn een aantal opties waaruit de gebruiker kan kiezen:
        // Een rode benzine personenauto met verwarming  met Elektrisch slot
        // Een groene LPG bestelbus met Elektrisch slot
        // Een grijze diesel bestelbus met GPS en Mechanisch slot
        // Een groene Waterstof auto met GPS en verwarming en spoiler en Gezichtsherkenning slot

    public void getOpties() {
        System.out.println("0 - Een rode benzine personenauto met verwarming met Elektrisch slot");
        System.out.println("1 - Een groene LPG bestelbus met Elektrisch slot");
        System.out.println("2 - Een grijze diesel bestelbus met GPS en Mechanisch slot");
        System.out.println("3 - Een groene Waterstof auto met GPS, verwarming en spoiler en Gezichtsherkenning slot");
        System.out.println("Type het nummer voor welke auto u wilt hebben");
    }

    public Vervoermiddel getVervoermiddel(int optie) {
        if(optie == 0) {
            // bouw nieuw vervoermiddel
            Vervoermiddel vervoermiddel = autoFabriek.bouwVervoermiddel(0, 1, 0);

            vervoermiddel.unlockVervoermiddel();
            vervoermiddel.StartMotor();
            System.out.println("Uw vervoermiddel rijdt een stukje.");
            vervoermiddel.StopMotor();
            vervoermiddel.lockVervoermiddel();
            vervoermiddel = new Verwarming(vervoermiddel);

            return vervoermiddel;
        }
        else if (optie == 1) {
            // bouw nieuw vervoermiddel
            Vervoermiddel vervoermiddel = bestelbusFabriek.bouwVervoermiddel(2, 2, 0);

            vervoermiddel.unlockVervoermiddel();
            vervoermiddel.StartMotor();
            System.out.println("Uw vervoermiddel rijdt een stukje.");
            vervoermiddel.StopMotor();
            vervoermiddel.lockVervoermiddel();

            return vervoermiddel;
        }
        else if (optie == 2) {
            // bouw nieuw vervoermiddel
            Vervoermiddel vervoermiddel = bestelbusFabriek.bouwVervoermiddel(1, 0, 1);

            vervoermiddel.unlockVervoermiddel();
            vervoermiddel.StartMotor();
            System.out.println("Uw vervoermiddel rijdt een stukje.");
            vervoermiddel.StopMotor();
            vervoermiddel.lockVervoermiddel();
            vervoermiddel = new GPS(vervoermiddel);

            return vervoermiddel;
        }
        else if (optie == 3) {
            // bouw nieuw vervoermiddel
            Vervoermiddel vervoermiddel = autoFabriek.bouwVervoermiddel(3, 2, 2);

            vervoermiddel.unlockVervoermiddel();
            vervoermiddel.StartMotor();
            System.out.println("Uw vervoermiddel rijdt een stukje.");
            vervoermiddel.StopMotor();
            vervoermiddel.lockVervoermiddel();
            vervoermiddel = new GPS(vervoermiddel);
            vervoermiddel = new Verwarming(vervoermiddel);
            vervoermiddel = new Spoiler(vervoermiddel);
            return vervoermiddel;
        }
        else {
            return null;
        }
    }

}
