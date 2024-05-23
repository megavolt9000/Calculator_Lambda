package calculator;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = calculator.Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y;


    BinaryOperator<Integer> devide = (x, y) -> {
        int result = 0;
        if (y == 0) {
            //реализация альтернативного варианта
            // throw new ArithmeticException("Ошибка. Деление на 0"); //Исключение с сообщением об  Ошибке
            System.out.print("Ошибка. Деление на ");
        } else {
            result = x / y;
        }
        return result;
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
