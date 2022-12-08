package p2;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem [] menuItems;
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        //создание элементов меню через вспомогательный метод addItem
        addItem("Капустные котлеты с рисом",
                "Вегетрианские котлеты из капусты в гляре , гарнир - рис", true, 2.99);
        addItem("Котлета с пюре",
                "Котелта по-киевски с нежнейшим картофельным пюре", false, 2.99);
        addItem("Борщ",
                "Горячий заправочный суп на основе свёклы, с добавлением картофеля, говядины, капусты", false, 3.29);
        addItem("Хот-дог",
                "Хот-дог с купатой, соленым огурцом, кетчупом, горчицей, посыпанный сыром",
                false, 3.05);
    }
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Меню полностью заполнено");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    //использование итератора для перебора элементов
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
// другие методы
}