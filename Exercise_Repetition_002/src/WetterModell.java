
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class WetterModell extends AbstractListModel{
    private ArrayList<WetterWert> alist = new ArrayList<>();
    @Override
    public int getSize() {
        return alist.size();
    }

    @Override
    public Object getElementAt(int i) {
        return alist.get(i);
    }
    public void add(WetterWert ww){
       alist.add(ww);
        fireIntervalAdded(this, 0, alist.size()-1);
   }
}

