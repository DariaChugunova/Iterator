import java.util.Iterator;
public class Shop_assistant {
    Shop clothes;
    Shop shoes;

    //конкретные классы заменяются интерфесом
    public Shop_assistant(Shop clothes, Shop shoes) {
        this.clothes = clothes;
        this.shoes = shoes;
    }
    public void printCatalog() {
        Iterator<ShopItem> clothesIterator = clothes.createIterator();
        Iterator<ShopItem> shoesIterator = shoes.createIterator();
        System.out.println("---Одежда---");
        printCatalog(clothesIterator);
        System.out.println("\n---Обувь---");
        printCatalog(shoesIterator);
    }
    private void printCatalog(Iterator iterator) {
        while (iterator.hasNext()) {
            ShopItem shopItem = (ShopItem)iterator.next();
            System.out.println("Название - "+ shopItem.getName());
            System.out.print("Размерная сетка - "+shopItem.getSize());
            System.out.println("Цена - "+shopItem.getPrice());
            System.out.println("Стирка - "+shopItem.getWash());
            System.out.println();
        }
    }



}