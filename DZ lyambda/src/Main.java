import java.util.function.*;

public class Main {
    public static void main(String[] args) {

//        создайте экземпляр класса Calculator через вызов статической переменной instance
        Calculator calc = Calculator.instance.get();

//        Произведите несколько математических операций над числами:
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(6, 2);
//        int c = calc.devide.apply(6, 0);
        calc.println.accept(c);
    }
}

//Создайте класс Calculator. В нем создайте статическую переменную типа Supplier.
class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    //        Далее добавьте несколько переменных типа BinaryOperator
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //    Здесь ошибка - возможное деление на 0
    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        }
        return 0;
    };
    //Добавьте несколько переменных типа UnaryOperator
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //    Добавьте переменную типа Predicate
    Predicate<Integer> isPositive = x -> x > 0;

    //    Добавьте переменную типа Consumer для вывода числа в консоль
    Consumer<Integer> println = System.out::println;
}



