import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

//        Задача о треугольнике: даны стороны треуголника a, b, с.
//        Ни одна из сторон трегольника не может быть длинее, чем сумма двух других.

        BufferedReader br = null; // сбрасываем (обнуляем буффер)

        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 1-ю сторону треугольника: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Введите 2-ю сторону треугольника: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Введите 3-ю сторону треугольника: ");
        int c = Integer.parseInt(br.readLine());

        br.close();

        Triangle t1 = new Triangle(a, b, c);


    }
}