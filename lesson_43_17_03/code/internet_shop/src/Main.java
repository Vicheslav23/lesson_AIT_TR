public class Main {
    public static void main(String[] args) {

        System.out.println("Интернет - магазин v 0.1");

/* Интернет магазин, часть 1
 Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 Создать класс Категория, имеющий переменные имя и массив товаров.
  Создать несколько объектов класса Категория.
   Создать класс Basket, содержащий массив купленных товаров (ArrayList).
    Создать класс User, содержащий логин, пароль и объект класса Basket.
     Создать несколько объектов класса User.
      Вывести на консоль каталог продуктов.
       Вывести на консоль покупки посетителей магазина.
 */
        // Создаём корзину
        Basket basket1 = new Basket("", 5);

        // Создаем покупателя
        User user1 = new User("toto",12345);

        // связываем покупателя и корзину
       user1.go(basket1);
        System.out.println("Покупатель с логином: " + basket1.getUser().login);

//        список товаров в корзине






    }
}