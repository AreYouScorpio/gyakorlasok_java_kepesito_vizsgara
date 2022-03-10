package bistros;

import java.util.ArrayList;
import java.util.List;

public class Bar extends Bistro {

    // private String name;
    // private Address address;
    private List<MenuItem> menuItems = new ArrayList<>();

    public Bar(String name, Address address) {
        super(name, address);
       // this.name = name;
       // this.address = address;
    }


    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public List<MenuItem> getMenu() {
        return menuItems;
    }


    @Override
    public void addMenuItem(MenuItem menuItem) {
        if (menuItem.getType() == MenuItemType.DRINK) {
            menuItems.add(menuItem);
        } else {
            throw new IllegalArgumentException("Only drink can be added to menu!");
        }
    }

    @Override
    public String getName() {
        return name + " (Only Drinks)";
    }


}
