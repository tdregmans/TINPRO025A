import java.time.YearMonth;

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

public class AutoFabriek extends Fabriek{

    AutoFabriek() {
        super();
    }

    // bouwVervoermiddel opties:
        // motorOptie:
            // 0 = BenzineMotor
            // 1 = DieselMotor
            // 2 = LPGMotor
            // 3 = WaterstofMotor
        // kleurOptie:
            // 0 = Grijs
            // 1 = Rood
            // 2 = Groen
            // 3 = Blauw
        // slotOptie:
            // 0 = ElektrischSlot
            // 1 = MechanischSlot
            // 2 = GezichtsherkenningSlot

    public Vervoermiddel bouwVervoermiddel(int motorOptie, int kleurOptie, int slotOptie) {
        Vervoermiddel vervoermiddel = new PersonenAuto(YearMonth.now().getYear());
        // voeg opties toe
        
        // Kies een optie voor de Motor
        if (motorOptie == 0) {
            vervoermiddel.setMotor(new BenzineMotor());
        }
        else if (motorOptie == 1) {
            vervoermiddel.setMotor(new DieselMotor());
        }
        else if (motorOptie == 2) {
            vervoermiddel.setMotor(new LPGMotor());
        }
        else if (motorOptie == 3) {
            vervoermiddel.setMotor(new WaterstofMotor());
        }

        // Kies een optie voor de Kleur
        if (kleurOptie == 0) {
            vervoermiddel.verfVervoermiddel("Grijs");
        }
        else if (kleurOptie == 1) {
            vervoermiddel.verfVervoermiddel("Rood");
        }
        else if (kleurOptie == 2) {
            vervoermiddel.verfVervoermiddel("Groen");
        }
        else if (kleurOptie == 3) {
            vervoermiddel.verfVervoermiddel("Blauw");
        }

        // Kies een optie voor het Slot
        if (slotOptie == 0) {
            vervoermiddel.setSlot(new ElektrischSlot());
        }
        else if (slotOptie == 1) {
            vervoermiddel.setSlot(new MechanischSlot());
        }
        else if (slotOptie == 2) {
            vervoermiddel.setSlot(new GezichtsherkenningSlot());
        }

        return vervoermiddel;
    }
}
