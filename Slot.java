
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

public abstract class Slot {
    private boolean statusSlot;

    public Slot() {
        statusSlot = false;
    }

    public boolean getStatusSlot() {
        return statusSlot;
    }

    public abstract void unlockVervoermiddel();

    public abstract void lockVervoermiddel();
}
