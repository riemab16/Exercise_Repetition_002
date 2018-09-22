
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;


public class WetterModell extends AbstractListModel{
    private ArrayList<WetterWert> wetterwerte = new ArrayList<>();
    private static String text = "";
    @Override
    
    public int getSize() {
        return wetterwerte.size();
    }

    @Override
    public Object getElementAt(int i) {
        return wetterwerte.get(i);
    }
    public void add(WetterWert ww){
       wetterwerte.add(ww);
        fireIntervalAdded(this, 0, wetterwerte.size()-1);
   }
     public static void load() {

        JFileChooser chooser = new JFileChooser();
        int res = chooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();

            try (BufferedReader br = new BufferedReader(
                    new FileReader(f))) {
                String line = "";
                while ((line = br.readLine()) != null) {
                    text += line + "\n";
                }

            } catch (Exception e) {

            }
        } 
    }
    public void save(File f){
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM - hh:mm:ss");
       try(BufferedWriter bw=new BufferedWriter(new FileWriter(f))){
                for (WetterWert ww : wetterwerte) {
                   bw.write(String.format("%s,%d,%d",ww.getZeitpunkt().format(dtf),ww.getTemperatur(),ww.getLuftfeuchigkeit()));
                   bw.newLine();
           }

            }catch(Exception ex){

            }
    }
}


