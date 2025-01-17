import java.util.Optional;

public class Seller extends Merchant{
    public Seller(String storeName, Inventory startingInventory) {
        super(storeName, startingInventory);
    }

    /**
     * Purchases an item. As the Seller does not have a money attribute,
     * the item will always be "bought".
     */
    public void buy(ItemInterface item) {
        inventory.addOne(item);
    }

    /**
     * Attempt to sell an item by name. If an item with a matching name is
     * found, the item is removed and returned.
     * @param itemName
     * @return The sold item.
     */
    public Optional<ItemInterface> sell(String itemName) {
        Optional<ItemInterface> result = removeItem(itemName);
        if (result.isPresent()) {
            return result;
        }
        return Optional.empty();
    }
}
