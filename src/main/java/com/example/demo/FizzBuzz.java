package com.example.demo;

public class FizzBuzz {

    public void hoge() {
        for (int i = -100; i < 100; i++) {
            System.out.println(Integer.toString(i) + " " + a(i));
        }
    }

    String a(int value) {
        if (value == 0) {
            return "";
        }
        return (value % 3 == 0 ? "Fizz" : "") + (value % 5 == 0 ? "Buzz" : "");
    }
}
