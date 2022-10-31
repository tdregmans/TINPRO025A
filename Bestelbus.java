
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

public class Bestelbus extends Vervoermiddel {
    
    Bestelbus() {
        super();
    }

    Bestelbus(int bouwjaar) {
        super(bouwjaar);
    }

    public void StartMotor() {
        motor.StartMotor();
        System.out.println("Motor van Bestelbus is gestart.");
    }

    public void StopMotor() {
        motor.StopMotor();
        System.out.println("Motor van Bestelbus is gestopt.");
    }

    public void unlockVervoermiddel() {
        slot.unlockVervoermiddel();
    }

    public void lockVervoermiddel() {
        slot.lockVervoermiddel();
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public void printKenmerken() {
        System.out.println("Een Bestelbus");
        super.printKenmerken();
    }
}

