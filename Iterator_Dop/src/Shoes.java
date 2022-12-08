import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Shoes implements Shop{
    // хранится в HashMap
    Map<String, ShopItem> shopItem = new HashMap<String, ShopItem>();
    public Shoes() {
        addItem("Кроссовки",
                "35-45",
                true, 6000);
        addItem("Туфли",
                " 37-40",
                false, 5000);
        addItem("Сапоги",
                "35-39",
                false, 8000);
    }
    public void addItem(String name, String size,
                        boolean wash, double price)
    {
        ShopItem shopItem1 = new ShopItem(name, size, wash, price);
        shopItem.put(shopItem1.getName(), shopItem1);
    }
    //используем встроенный итератор для ArrayList

    @Override
    public Iterator<ShopItem> createIterator() {
        return shopItem.values().iterator();
    }
}

