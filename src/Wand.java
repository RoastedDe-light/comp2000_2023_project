public class Wand {
    Item item;

    public Wand(String name, String description, Double value, int expiry) {
        this.item = new Item(name, description, value, expiry);
    }

    public InventoryTableRow getInventoryTableRow() {
        return item.getInventoryTableRow();
    }

    public CartTableRow getCartRow(String column3) {
        return item.getCartRow(column3);
    }
}
