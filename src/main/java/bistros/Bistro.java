package bistros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bistro {
    protected String name;
    protected Address address;
    private List<MenuItem> menuItems = new ArrayList<>();


    public Bistro(String name, Address address) {
        this.name = name;
        this.address=address;
    }



    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<MenuItem> getMenu() {
        return new ArrayList<>(menuItems);
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bistro)) return false;
        Bistro bistro = (Bistro) o;
        return Objects.equals(name, bistro.name) && Objects.equals(address, bistro.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
