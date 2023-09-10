import java.util.Optional;

public abstract class Merchant {
    protected String name;
    protected Inventory inventory;

    public Merchant(String playerName, Inventory startingInventory) {
        name = playerName;
        inventory = startingInventory;
    }

    public abstract void buy(ItemInterface item);
    public abstract Optional<ItemInterface> sell(String itemName);
    
    /**
     * Adds an item to the held Inventory.
     * @param item
     */
    public void addItem(ItemInterface item) {
        inventory.addOne(item);
    }

    /**
     * Removes and returns an item from the held Inventory that matches
     * the `itemName` parameter.
     * @param itemName
     */
    public Optional<ItemInterface> removeItem(String itemName) {
        return inventory.removeOne(itemName);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

}
