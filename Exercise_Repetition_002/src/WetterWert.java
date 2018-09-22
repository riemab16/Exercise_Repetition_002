
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class WetterWert {
    private int temperatur;
    private int luftfeuchtigkeit;    
    private LocalDateTime zeitpunkt;
    
    public WetterWert(int temperatur, int luftfeuchtigkeit, LocalDateTime zeitpunkt){
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.zeitpunkt = zeitpunkt;
   
    }
    
    public String toString(){
        DateTimeFormatter dtfZ = DateTimeFormatter.ofPattern("dd.MM - hh:mm:ss");
        return String.format("%s - %d° - %d%%",zeitpunkt.format(dtfZ),temperatur,luftfeuchtigkeit);
    }
}