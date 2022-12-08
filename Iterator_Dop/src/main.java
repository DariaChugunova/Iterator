public class main {
    public static void main(String[] args) {
        //создаем каталог
        Shoes shoes = new Shoes();
        Сlothes clothes = new Сlothes();

        //передаем продавцу
        Shop_assistant shop_assistant = new Shop_assistant(shoes,clothes);
        shop_assistant.printCatalog();

    }
}
