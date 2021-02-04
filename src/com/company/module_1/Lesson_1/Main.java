package com.company.module_1.Lesson_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//	Задание 2
//		Напишите программу, в которой я запрашиваю имя, фамилию, возраст, страну,
//		и в конце программа выводит данные пользователя в консоль.
//		Ввод:					Вывод:
//        Ilyas					Name: Ilyas
//        Zhuanyshev			Surname: Zhuanyshev
//        28					Age: 28
//        Kazakhstan			Country: Kazakhstan

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите имя:");
//        String name = in.next();

//        System.out.println("Введите фамилию:");
//        String surname = in.next();

//        System.out.println("Введите возраст:");
//        int age = in.nextInt();

//        System.out.println("Введите страну проживания:");
//        String country = in.next();

//        System.out.println("Имя: " + name);
//        System.out.println("Фамилия: " + surname);
//        System.out.println("Возраст: " + age);
//        System.out.println("Страна: " + country);

//	Задание 3
//		Напишите программу, в которой я ввожу два целостных числа,
//		и если первое число больше второго,
//		то программа выведет true, иначе false.

//	    int a = 100;
//	    int b = 80;
//	    boolean c = a>b;

//	    System.out.println(c);

//	Задание 4
//		Напишите программу, в которой я ввожу три целостных числа a, b и c.
// 		Выведите сумму, умножение и разницу всех этих чисел.

//		int a = 10;
//		int b = 20;
//		int c =	 30;

//		System.out.println(a+b+c);
//		System.out.println(a-b-c);
//		System.out.println(a*b*c);

//Задание 5
//Выполните данную математическую операцию, где я ввожу a, b и c с консоли. Выполните данную операцию: a3 + 2b2 – 3ab + c3
//
//*Подсказка: Вы можете использовать метод Math.pow(). Пример: Math.pow(3,2) = 9.

//		Scanner in = new Scanner(System.in);

//		System.out.println("insert a");
//		int a = in.nextInt();
//		System.out.println("a="+a);

//		System.out.println("insert b");
//		int b = in.nextInt();
//		System.out.println("b="+b);

//		System.out.println("insert c");
//		int c = in.nextInt();
//		System.out.println("c="+c);

//		System.out.println("insert a2");
//		int a2 = (int) Math.pow(a,3);
//		System.out.println("Result Math.pow(a,3) a2 ="+a2);

//		System.out.println("insert a3");
//		int a3 = 3*a;
//		System.out.println("Result a3="+a3);

//		System.out.println("insert b2");
//		int b2 = 2*b;
//		System.out.println("Result b2="+b2);

//		System.out.println("insert b3");
//		int b3 = (int) Math.pow(b2,2);
//		System.out.println("Result Math.pow(2b,3) b3 ="+b3);

//		System.out.println("insert c2");
//		int c2 = (int) Math.pow(c,3);
//		System.out.println("Result Math.pow(c,3)="+c2);

		//a3+2b2-3ab+c3
//		int d = a2+b3-(a3*b)+c2;

//		System.out.println("Result d="+d);
//Задание 6
//Напишите программу, которая запрашивает два числа a и b. Найдите гипотенузу треугольника с заданными катетами.
//
//*Подсказка: Вы можете использовать метод Math.sqrt().

//		Scanner in = new Scanner(System.in);

//		System.out.println("insert a");
//		int a = in.nextInt();
//		System.out.println("a="+a);

//		System.out.println("insert b");
//		int b = in.nextInt();
//		System.out.println("b="+b);

//		System.out.println("insert a");
//		int a2 = (int) Math.pow(a,2);
//		System.out.println("a="+a2);

//		System.out.println("insert b2");
//		int b2 = (int) Math.pow(b,2);
//		System.out.println("b="+b2);

//		System.out.println("insert c");
//		double c = (double) Math.sqrt(a2+b2);
//		System.out.println("Result Math.sqrt(a+b) ="+c);

//Задание 7
//		n школьников делят k яблок поровну, неделящийся остаток остается в корзинке.
// 		Сколько яблок достанется каждому школьнику?
//
//		Ввод:			Ввод:
//		3 10			4 19
//		Вывод:			Вывод:
//		3				4
//

//		Scanner in = new Scanner(System.in);

//		System.out.println("insert n");
//		int n = in.nextInt();
//		System.out.println("n="+n);

//		System.out.println("insert k");
//		int k = in.nextInt();
//		System.out.println("k="+k);

//		System.out.println("insert q");
//		int q = k/n;
//		System.out.println("Result q ="+q);

// Задание 8
//n школьников делят k яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзинке?
//
//*Подсказка: Вы можете использовать оператор % который возвращает остаток от деления.
//
//		Ввод:			Ввод:
//		3 14			4 19
//		Вывод:			Вывод:
//		2				3

		Scanner in = new Scanner(System.in);

		System.out.println("insert n");
		int n = in.nextInt();
		System.out.println("n="+n);

		System.out.println("insert k");
		int k = in.nextInt();
		System.out.println("k="+k);

		System.out.println("insert r");
		int r = k%n;
		System.out.println("Result r ="+r);

	}
}