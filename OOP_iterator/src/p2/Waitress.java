package p2;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    //передаются объекты меню
    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    //создаем два итератора
    //вызываем метод для каждого итератора
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("Меню\n----\nЗавтрак");
        printMenu(pancakeIterator);
        System.out.println("\nОбед");
        printMenu(dinerIterator);
    }

    //проверка остались ли элементы
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
// другие методы
}