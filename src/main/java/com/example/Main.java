package com.example;

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
    }
}
