public class Item implements ItemInterface {
    String name;
    String description;
    double value;
    int expiry;

    public Item(String itemName, String itemDescription, Double itemValue, int itemExpiry) {
        name = itemName;
        description = itemDescription;
        value = itemValue;
        expiry = itemExpiry;
    }

    @Override
    public InventoryTableRow getInventoryTableRow() {
        return new InventoryTableRow(name, description, String.valueOf(value), expiry + "");

    }

    @Override
    public CartTableRow getCartRow(String column3) {
        return new CartTableRow(name, String.valueOf(value), column3);
    }
}
