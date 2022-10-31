
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

public class WaterstofMotor extends Motor {
    private boolean statusMotor;

    WaterstofMotor() {
        super();
    }

    public void StartMotor() {
        statusMotor = true;
        System.out.println("Waterstofmotor is gestart.");
    }

    public void StopMotor() {
        statusMotor = false;
        System.out.println("Waterstofmotor is gestopt.");
    }
}
