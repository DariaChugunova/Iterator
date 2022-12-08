package p1;

import java.util.ArrayList;

public class PancakeHouseMenu {
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
    //getMenuItems возвращает список элементов меню
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
// другие методы
}
