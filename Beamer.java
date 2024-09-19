
/**
 * Beschreiben Sie hier die Klasse Beamer.
 * 
 * @author (DAW) 
 * @version (12.09.2024)
 */
public class Beamer
{

    private String raum;
    private boolean eingeschaltet;
    private int restzeit;

    public Beamer (String neuRaum, boolean neuEingeschaltet, int neuRestzeit){
        setRaum(neuRaum);
        setEingeschaltet(neuEingeschaltet);
        setRestzeit(neuRestzeit);
    }

    //setter
    public void setRaum (String neuRaum) {
        raum = neuRaum;
    }

    public void setEingeschaltet (boolean neuEingeschaltet){

        eingeschaltet = neuEingeschaltet;

    }

    public void setRestzeit (int neuRestzeit){

        restzeit = neuRestzeit;

    }

    //getter
    public String getRaum() {
        return raum;
    }

    public boolean isEingeschaltet(){
        return eingeschaltet;
    }

    public int getRestzeit() {
        return restzeit;
    }
}
