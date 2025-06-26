package com.kuznetsovaevgeni;

public class Main {
    public static void main(String[] args) {
        // 0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 20;
        int b = 100;
        Operations.countIntOperations(a,b);
        //1) применить несколько арифметических операций над int и double в одном выражении
        int c = 5;
        double d = 2.5;
        Operations.countDifOperations(c,d);
        //2) применить несколько логических операций ( < , >, >=, <= )
        int e = 23;
        int f = 23;
        Operations.logicOperations(e,f);

        //4) получить переполнение при арифметической операции
        Operations.Overflow();
    }
}