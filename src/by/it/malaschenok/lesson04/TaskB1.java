package by.it.malaschenok.lesson04;

import java.util.Scanner;

/*
Определите количество дней в году

Ввести с клавиатуры год, определить количество дней в году.
Результат вывести на экран в следующем виде:
«количество дней в году: x», где
х — 366 для високосного года,
х — 365 для обычного года.

Подсказка:
В високосном году — 366 дней, тогда как в обычном — 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.

Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — не високосные.


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введенный год является високосным, необходимо вывести текст: "количество дней в году: 366"
4. Если введенный год не является високосным, необходимо вывести текст: "количество дней в году: 365"

*/
public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int a = x % 4;
        int b = x % 400;
        int c = x % 100;
        if (b == 0) System.out.println("количество дней в году: 366");
        else if (c == 0 && b != 0) System.out.println("количество дней в году: 365");
        else if (a == 0 && c != 0) System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
    }
}
