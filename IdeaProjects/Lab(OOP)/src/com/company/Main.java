package com.company;

public class Main {

    public static void main(String[] args) {
        long a = 1, b = 1, n = 1, m = 2, sum = 0;
        for (long i = a; i <= n ; i++) {
            if (i - 2 == 0) {
                System.out.println("ZeroDivisionError");
                System.exit(1);
            }
            for (long j = b; j <= m; j++) {
                if (i * j == 0) {
                    System.out.println("Так як дріб, чисельник якого 0, а знаменник відмінний від 0, рівний нулю, то поточний доданок - 0");
                }
                sum += (double)(i * j) / (i - 2);
            }
        }
        System.out.println(sum);
    }
}
