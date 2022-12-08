package p3;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;
    public PancakeHouseMenu() {
        //элементы меню хранятся в ArrayList
        menuItems = new ArrayList<MenuItem>();
        //Каждый объект меню вкючается в ArrayList в конструкторе
        addItem("Блинный завтрак",
                "Блинчики с яичницей, колбасой",
                false,
                2.99);
        addItem("Блины с клубникой",
                "Блинчики со свежей клубникой",
                true,
                2.99);
        addItem("Блины с черникой",
                "Блинчики со свежей черникой",
                true,
                3.49);
        addItem("Вафли с шоколадным",
                "Вафли с шоколадным топингом",
                true,
                3.59);
    }
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    //используем встроенный итератор для ArrayList
    //поэтому создавать новый класс не надо
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }


}