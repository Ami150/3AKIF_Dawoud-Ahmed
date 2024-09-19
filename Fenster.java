
/**
 * Beschreiben Sie hier die Klasse Fenster.
 * 
 * @author (DAW) 
 * @version (12.09.2024)
 */
public class Fenster
{
    private int hoehe;
    private int breite;
    private boolean offen;
    
    //Konstruktoren
    
    public Fenster(){
    
        setHoehe(220);
        setBreite(280);
        setOffen(true);
    }

    public Fenster(int neuHoehe, int neuBreite, boolean neuOffen){

        setHoehe(neuHoehe);
        setBreite(neuBreite);
        setOffen(neuOffen);
    }

    // setters
    public void setHoehe (int neuHoehe){

        hoehe = neuHoehe;

    }

    public void setBreite(int neuBreite){

        breite = neuBreite;
    }

    public void setOffen(boolean neuOffen){
        offen = neuOffen;
    }

    //getters
    public int getHoehe(){

        return hoehe;
    }
    
    public int getBreite(){

        return breite;
    }
    
    public boolean isOffen(){

        return offen;
    }
    
    public void printFenster(){
    
        System.out.println("Die Werte des Fensters sind. ");
        System.out.println("Höhe: " + hoehe);
        System.out.println("Breite: " + breite);
        System.out.println("Das Fenster ist offen: " + offen);
        System.out.println("*****Das sind die Werte*****");
        System.out.println("Der Umpfang ist " + (2*hoehe + 2*breite) + " cm");
    }
}

