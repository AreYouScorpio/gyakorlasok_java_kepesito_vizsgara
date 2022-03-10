package bistros;

import java.util.ArrayList;
import java.util.List;

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
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

}
