package bistros;

public class MenuItem {
    private String name;
    private double price;
    private MenuItemType type;

    public MenuItem(String name, double price, MenuItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public double getPrice(){
        return price=price*(type.tax/100.0+1.0);
    }

    public String getName() {
        return name;
    }

    public MenuItemType getType() {
        return type;
    }
}
