package bistros;

public enum MenuItemType {
    FOOD (20),
    DRINK (27);

    public final int tax;

    private MenuItemType(int tax) {
        this.tax = tax;
    }
}
