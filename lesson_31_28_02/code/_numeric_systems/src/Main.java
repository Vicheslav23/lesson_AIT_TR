public class Main {
    public static void main(String[] args) {

        System.out.println("Перевод из одной числовой системы в другую методами в Java");
        System.out.println();

        //Перевод из двоичной в десятичную
        System.out.println("Перевод из двоичной системы в десятичную");
        String string_num = "1000"; // двоичное число задано строкой
        System.out.println("Двоичное число (строка символов): " + string_num);

        System.out.println("В десятичной системе это число: " + Integer.parseInt(string_num,2));
        System.out.println();

        //Перевод из десятичной системы в двоичную и другие
        System.out.println("Перевод десятичного числа в двоичное (будет выведено строкой)");
//        int n = 12345;
        long n = 9876543210L;
        System.out.println("Десятичное число: " + n);

        String binary_num = "";
//      binary_num = Integer.toBinaryString(n);
        binary_num = Long.toBinaryString(n);
        System.out.println("Двоичное представление этого числа: " + binary_num);
        System.out.println();

//        String octagal_num = Integer.toOctalString(n);
        String octagal_num = Long.toOctalString(n);
        System.out.println("В восьмеричной системе это: " + octagal_num);
        System.out.println();

//        String hex_num = Integer.toHexString(n);
        String hex_num = Long.toHexString(n);
        System.out.println("В 16-ричной системе это: " + hex_num);
        System.out.println();

        //Пееревод числа из типа String в числовой тип int
        System.out.println("Перевод строки, содержащей число, в число");
        String hundred = "155";
        int hundredNumber = Integer.parseInt(hundred); // присвоили найденное в строке число в переменную
        System.out.println(hundredNumber); // находим число внутри строки
        System.out.println();

        String st = "5";
        int table_num = Integer.parseInt(st);
        System.out.println("Номер столика: " + table_num);
    }
}