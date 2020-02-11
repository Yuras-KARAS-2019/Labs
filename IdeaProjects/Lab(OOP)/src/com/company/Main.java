package com.company;

public class Main {

    public static void main(String[] args) {
        long a = 1, b = 1, n = 2, m = 2, sum = 0;
        for (long i = a; i <= n; i++) {
            for (long j = b;j <= m; j++) {
                long operation = 0;
                if (i * j == 0) {
                    System.out.println("При виконанні завдання виникла помилка, пропускаємо");
                    continue;
                } else if (i - 2 == 0) {
                    System.out.println("ZeroDivisionError");
                    System.out.println("При виконанні завдання виникла помилка ділення на 0, операція невизначена, пропуск (((");
                    continue;
                }
                else{
                    operation = (i * j) / (i - 2);
                    sum += operation;
                }
            }
        }
        System.out.println(sum);
    }
}
