package p3;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    //Объект MenuItem содержит несколько полей
    //имя, описание, флаг вегана, цена
    //Значения передаются конструктору для инициализации объекта MenuItem
    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

}
