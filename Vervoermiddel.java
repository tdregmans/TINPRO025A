
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

public abstract class Vervoermiddel {
    protected Motor motor;
    protected int bouwjaar;
    protected String kleur;
    protected Slot slot;
    
    Vervoermiddel() {
        this.motor = null;
        this.bouwjaar = 0;
        this.kleur = null;
        this.slot = null;
    }

    Vervoermiddel(int bouwjaar) {
        this.motor = null;
        this.bouwjaar = bouwjaar;
        this.kleur = null;
        this.slot = null;
    }

    public void verfVervoermiddel(String kleur) {
        this.kleur = kleur;
    }

    public abstract void StartMotor();

    public abstract void StopMotor();

    public abstract void unlockVervoermiddel();

    public abstract void lockVervoermiddel();

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public void printKenmerken() {
        System.out.println(
            "bouwjaar: " + bouwjaar + 
            "; kleur: " + kleur
            );
    }
}
