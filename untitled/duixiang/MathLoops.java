package two_20230924;

import java.util.Scanner;

public class MathLoops
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true)
        {
            System.out.print("Enter method and argument (e.g., prime 17 or factors 24): ");
            input = scanner.nextLine();

            if (input.equals("quit"))
            {
                break;
            }

            String[] tokens = input.split(" ");
            if (tokens.length != 2) {
                System.out.println("Invalid input format. Please use 'method argument'.");
                continue; // Skip this iteration if the input format is invalid
            }

            String method = tokens[0];
            long argument = Long.parseLong(tokens[1]);

            if (method.equals("prime")) {
                boolean isPrime = prime(argument);
                System.out.println(isPrime);
            } else if (method.equals("factors")) {
                String primeFactors = factors(argument);
                System.out.println(primeFactors);
            } else {
                System.out.println("Invalid method name. Please use 'prime' or 'factors'.");
            }
        }

        scanner.close();
    }
    //public
    //static
    /*public（公共）：

    public表示该方法可以被任何其他类访问，不受访问限制。
    当一个方法被声明为 public 时，它可以从程序的任何部分被调用，无论这个方法在哪个类中定义。
    这种修饰符通常用于公共接口、类的公共方法，或者在不同的包中让其他类能够访问某个方法。

    example:
    // MainClass.java
package com.example;

public class MainClass {
    public static void printMessage() {
        System.out.println("Hello, World!");
    }
}

// AnotherClass.java
package anotherpackage;

import com.example.MainClass;

public class AnotherClass {
    public static void main(String[] args) {
        // 调用 MainClass 中的 public 方法
        MainClass.printMessage();
    }
}
*/

/*
    static（静态）：

    static 也是一种修饰符，用于定义静态方法和静态成员（字段或变量）。
    静态方法和静态成员属于类本身，而不是类的实例。它们在类加载时就已经存在，不需要创建对象就可以调用。
    静态方法可以被类名直接调用，而不需要创建类的实例。例如，ClassName.staticMethod()。

  */
    public static boolean prime(long n)
    {
        if (n <= 1)
        {
            return false;
        }
        if (n <= 3)
        {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0)
        {
            return false;
        }
        for (long i = 5; i * i <= n; i += 6)
        {
            if (n % i == 0 || n % (i + 2) == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static String factors(long n)
    {
        String result = "";

        if (n > 1)
        {
            for (long i = 2; i <= n; i++)
            {
                while (n % i == 0)
                {
                    result += i+" ";
                    n /= i;
                }
            }
        }
        return result;
    }
}
