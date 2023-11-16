package org.contourgara;

/**
 * このクラスは、FizzBuzzのルールを定義します。
 */
public final class FizzBuzz {
    /**
     * インスタンスを生成しないでください。
     */
    private FizzBuzz() {}

    /**
     * 入力値が 3 の倍数の場合は Fizz、入力値が 5 の倍数の場合は Buzz、入力値が 15 の倍数の場合は FizzBuzz を返します。
     *
     * @param num 入力値
     * @return 入力値が 3 の倍数の場合は Fizz、入力値が 5 の倍数の場合は Buzz、入力値が 15 の倍数の場合は FizzBuzz
     */
    public static String fizzBuzz(Integer num) {
        if (num % 15 == 0) return "FizzBuzz";
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }
}
