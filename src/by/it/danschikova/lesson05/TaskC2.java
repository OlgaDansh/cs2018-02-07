package by.it.danschikova.lesson05;
import java.util.Scanner;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class TaskC2 {
    public static void main(String[] args) {
        int m []=new int [20];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<20;i++)
            m[i]=sc.nextInt();
        sort(m);
        for (int i=0; i<20; i++)
        System.out.println(m[i]);

    }
    //Напишите тут ваш код


    public static void sort(int[] array) {
        for (int a=1; a<array.length; a++)
            for (int b=array.length - 1 ; b>=a; b--) {
            if (array [b-1]<array [b]){
                int t=array [b-1];
                array[b-1]=array[b];
                array[b]=t;
            }
            }


        //Напишите тут ваш код
    }

}
