package bistros;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class City {
    private Set<Bistro> bistros = new HashSet<Bistro>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(bistros, city.bistros);
    }


    public void addBistros(Bistro bistro){
        bistros.add(bistro);
    }

}
