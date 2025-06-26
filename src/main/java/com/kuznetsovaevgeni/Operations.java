package com.kuznetsovaevgeni;

public class Operations {

    public static void countIntOperations(int a, int b) {
        int resSum = a + b;
        int resSub = a - b;
        int resMul = a * b;
        int resDiv = a / b;
        int resDivLeftover = a % b;
        System.out.println("\n2 примитива типа int");
        System.out.println("Сумма: " + resSum);
        System.out.println("Разность: " + resSub);
        System.out.println("Произведение: " + resMul);
        System.out.println("Частное: " + resDiv);
        System.out.println("Остаток от деления: " + resDivLeftover);
    }

    public static void countDifOperations(int c, double d) {
        double resSumDif = c + d;
        double resSubDif = c - d;
        double resMulDif = c * d;
        double resDivDif = c / d;
        double resDivDifLeftover = c % d;
        System.out.println("\n2 примитива типов int и double");
        System.out.println("Сумма: " + resSumDif);
        System.out.println("Разность: " + resSubDif);
        System.out.println("Произведение: " + resMulDif);
        System.out.println("Частное: " + resDivDif);
        System.out.println("Остаток от деления: " + resDivDifLeftover);
    }

    public static void logicOperations(int e, int f) {
        boolean isBigger = e > f;
        boolean isSmaller = e < f;
        boolean isBiggerOrEqual = e >= f;
        boolean isSmallerOrEqual = e <= f;
        boolean isEqual = e == f;
        boolean isNotEqual = e != f;

        System.out.println("\nЛогические операции");
        System.out.println(e + " больше " + f + ": " + isSmaller);
        System.out.println(e + " меньше " + f + ": " + isBigger);
        System.out.println(e + " больше или равно " + f + ": " + isBiggerOrEqual);
        System.out.println(e + " меньше или равно " + f + ": " + isSmallerOrEqual);
        System.out.println(e + " равно " + f + ": " + isEqual);
        System.out.println(e + " не равно " + f + ": " + isNotEqual);

    }

    public static void Overflow() {
        int OverflowInt = Integer.MAX_VALUE;
        System.out.println("\nПереполнение:");
        System.out.println("Для наглядности возьмем предпоследнее значение int: " + --OverflowInt +
                        "\nДобавили 1: " + ++OverflowInt +
                        "\nДобавили 1: " + ++OverflowInt + " Упс! Переполнение" +
                        "\nДобавили 1: " + ++OverflowInt
        );
    }
}
