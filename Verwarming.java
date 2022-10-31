
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

public class Verwarming extends Decorator{

    public Verwarming(Vervoermiddel v) {
        super(v);
    }

    // Override Vervoermiddel abstract methods
    @Override
    public void StartMotor() {}

    @Override
    public void StopMotor() {}

    @Override
    public void lockVervoermiddel() {}

    @Override
    public void unlockVervoermiddel() {}

    public void printKenmerken() {
        super.printKenmerken();
        System.out.println("....met een Verwarming");
    }
}
