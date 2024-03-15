package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Greeting greeting1 = new HelloWorldGreeting();
        greeting1.sayHello();

        // Short usage for less code
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello world, again!");
            }
        };
        greeting2.sayHello();

        // Lambda usages
        Greeting greeting3 = () -> System.out.println("Hello world, again and again!");
        greeting3.sayHello();

        Calculator calculator = (int x, int y) -> {
          Random random = new Random();
          int randomNumber = random.nextInt(50);
          return x * y + randomNumber;
        };
        System.out.println(calculator.calculate(4,7));

    }
}
