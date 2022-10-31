
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

public class ElektrischSlot extends Slot {
    private boolean statusSlot;

    ElektrischSlot() {
        super();
    }

    public void unlockVervoermiddel() {
        statusSlot = false;
        System.out.println("Elektrischslot is open.");
    }

    public void lockVervoermiddel() {
        statusSlot = true;
        System.out.println("Elektrischslot is dicht.");
    }
}
