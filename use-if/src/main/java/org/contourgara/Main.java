package org.contourgara;

/**
 * メインクラス。
 * FizzBuzz が実行されます。
 */
public class Main {
    /**
     * メインメソッド。
     * 1 から 100 までの数字が出力され、3 の倍数のときは Fizz、5 の倍数の時は Buzz、15 の倍数の時は FizzBuzz と出力されます。
     *
     * @param args 使用しません。
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            System.out.println(FizzBuzz.fizzBuzz(i));
        }
    }
}
