
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

public class MechanischSlot extends Slot {
    private boolean statusSlot;

    MechanischSlot() {
        super();
    }

    public void unlockVervoermiddel() {
        statusSlot = false;
        System.out.println("Mechanischslot is open.");
    }

    public void lockVervoermiddel() {
        statusSlot = true;
        System.out.println("Mechanischslot is dicht.");
    }
}
