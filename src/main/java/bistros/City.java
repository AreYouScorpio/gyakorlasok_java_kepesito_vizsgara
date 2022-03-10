package bistros;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class City {
    private Set<Bistro> bistros = new HashSet<Bistro>();



    public void addBistros(Bistro bistro){
        bistros.add(bistro);
    }
}
