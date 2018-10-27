import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        int number = 1215132;     // задание 8 - 3.8   страница 26 Рабочая тетрадь
        int pr = 1;
        while (number != 1) {
            pr = pr * (number % 10);
            number = number / 10;
        }
        System.out.println("Факториал числа  = " + pr + "( Задание 8)");

        int[] array = new int[10];                  // задание 9 - 3.9   страница 27 Рабочая тетрадь
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max + "( Задание 9)");

        int num = r.nextInt(10000);   // задание № 10 - 3.10 страница 27 Рабочая тетрадь
        System.out.println("Случайное число - " + num);
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Сумма числа  = " + sum + " (Задание 10)");

        int a = 1150250750;                  // задание № 12 - 3.12 страница 29 Рабочая тетрадь
        String a1 = String.valueOf(a);
        int n = a1.length();
        int n1 = 0;
        int ost = n%3;
        for (int i1 = 0; i1 < ost; i1++) {
            System.out.print(a1.charAt(i1)); }
        System.out.print(" ");
        for (int i1 = ost; i1 <= a1.length()-1; i1++) {
            n1++;
            if (n1 != 3) {
                System.out.print(a1.charAt(i1));
            }
            if (n1 == 3) {
                System.out.print(a1.charAt(i1)+ " ");
                n1 = 0;
            }
        }

        System.out.println(" ");

        int massiv[] = {15, 7, 6, 10, 8, 4, 3, 12, 5};// задание № 13 - 3.13 страница 30 Рабочая тетрадь
        int i;
        for (i = 0; i < massiv.length; i++) {
            int n2 = massiv[i];
            if (n2 == 5) {
                break;
            }
        }
        System.out.println("Номер цифры 5 = " + i); // Задание тоже  3,13 - вариант со строкой

        String s = "Wonderful";
        char s1;
        for (int i1 = 0; i1 < s.length(); i1++) {
            s1 = s.charAt(i1);
            if (s1 == 'f') {
                break;
            }
        }
        System.out.println(s.substring(0, s.indexOf('f')));

    }}


