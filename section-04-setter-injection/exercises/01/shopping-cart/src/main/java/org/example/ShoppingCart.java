package org.example;

public class ShoppingCart {
    Item item;

    public Item getItem() {
        return item;
    }

    public ShoppingCart setItem(Item item) {
        this.item = item;
        return this;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "item=" + item +
                '}';
    }
}
