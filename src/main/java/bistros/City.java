package bistros;

import java.util.*;

public class City {
    private Set<Bistro> bistros = new HashSet<Bistro>();



    public void addBistro(Bistro bistro){
        bistros.add(bistro);
    }

    public Set<Bistro> getBistros() {
        return bistros;
    }

    public Bistro findBistroByAddress(Address address){
        return bistros.stream().filter(a->a.getAddress().equals(address)).findFirst().get();
    }

    /* for ciklussal:

    public Bistro findLongestMenu(){
        int max=0;
        Bistro maxBistro = null;
        for (Bistro actual : bistros) {
            if (actual.getMenu().size()>max) {
                max=actual.getMenu().size();
                maxBistro=actual;
            }
        }
       return maxBistro;
    }

     */

    // streammel:
    public Bistro findLongestMenu(){
        return bistros.stream().
                sorted(Comparator.comparingInt((Bistro b) -> b.getMenu().size()).reversed()).
                findFirst().get();
    }

    public List<Bistro> findBistroWithMenuItem(String menuItemName){
        return bistros.stream().
                filter( b-> b.getMenu().stream().anyMatch(c->c.getName().equals(menuItemName))).
                toList();
    }
}
