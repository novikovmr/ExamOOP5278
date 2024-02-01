// Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
// Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
// Соблюдать принципы SOLID, паттерны проектирования.

public class App {
    public static void main(String[] args) throws Exception {
        ComplexNumber prymaryNumb = new ComplexNumber(0, 0);

        iCalculator calc = new Calculator(prymaryNumb);

        Decorator newCalc = new Decorator(new Calculator(prymaryNumb), new Logger());

        ViewCalc view = new ViewCalc(newCalc);
        view.run();
    }
}

