
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class WetterModell extends AbstractListModel{
    private ArrayList<String> alist = new ArrayList<>();
    @Override
    public int getSize() {
        return alist.size();
    }

    @Override
    public Object getElementAt(int i) {
        return alist.get(i);
    }
    
}
