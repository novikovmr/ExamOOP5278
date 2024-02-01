import java.util.Scanner;

public class ViewCalc {
    private iCalculator calculator;

    public ViewCalc(iCalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * @param primaryTemp - Первое комплексное число
     * @param complexArg - Второе (или последующее введеное пользователем) комплексное число
     * @param action - Символ операции
     * Метод описывает взаимодействие пользователя с программой. 
     * Запрос действительной и мнимой частей первого комплексного числа ->
     * выбор пользоватем операции (сложение, вычитание, умножение, равенство)-> выбор пользователм продолжения или завершения работы метода.
     * В случае продолжения цикл начинается сначала, в противном случае - завершение работы программы. 
     * 
     */
    public void run() {
        while (true) {
            ComplexNumber primaryTemp = promptComplexNumber("Введите действительную часть ПЕРВОГО комплексного числа: ", "Введите мнимую часть ПЕРВОГО комплексного числа: ");
            calculator.sum(primaryTemp);
            while (true) {
                String action = prompt("Введите команду (+, =, *) : ");
                if (action.equals("+")) {
                    ComplexNumber complexArg = promptComplexNumber("Введите действительную часть ВТОРОГО комплексного числа: ", "Введите мнимую часть ВТОРОГО комплексного числа: ");
                    calculator.sum(complexArg);
                    continue;
                }
                if (action.equals("-")) {
                    ComplexNumber complexArg = promptComplexNumber("Введите действительную часть ВТОРОГО комплексного числа: ", "Введите мнимую часть ВТОРОГО комплексного числа: ");
                    calculator.div(complexArg);
                    continue;
                }
                if (action.equals("*")) {
                    ComplexNumber complexArg = promptComplexNumber("Введите действительную часть ВТОРОГО комплексного числа: ", "Введите мнимую часть ВТОРОГО комплексного числа: ");
                    calculator.mult(complexArg);
                    continue;
                }
                if (action.equals("=")) {
                    ComplexNumber result = calculator.getRes();
                    System.out.printf("Ваш результат : %.2f + %.2f * i\n", result.getRealNumber(), result.getComplexNumber());
                    break;
                }
                
            }
            String action = prompt("Еще посчитать (Y/N)?");
            if (action.equals("Y")) {
                continue;
            }
            break;
        }
    }

    /**
     * 
     * @param firstMsg - Текст запроса первого комплексного числа
     * @param secondMsg - Текст запроса второго комплексного числа
     * @param firstPromtArg - переменная, содержащая действительную часть числа, введенного пользователем
     * @param secondPromtArg - переменная, содержащая мнимую часть числа, введенного пользователем
     * @param promptNumber - Экзмепляр класса ComplexNumber с параметрами firstPromtArg и secondPromtArg
     * @return - Возращение promptNumber
     */ 
    private ComplexNumber promptComplexNumber(String firstMsg, String secondMsg) {
        Scanner inReal = new Scanner(System.in);
        System.out.println(firstMsg);
        double firstPromtArg = Double.parseDouble(inReal.nextLine());

        Scanner inImagine = new Scanner(System.in);
        System.out.println(secondMsg);
        double secondPromtArg = Double.parseDouble(inImagine.nextLine());

        ComplexNumber promptNumber = new ComplexNumber(firstPromtArg, secondPromtArg);

        System.out.println(promptNumber);
        return promptNumber;
    }


    /**
     * 
     * @param message - Переменная, хранящая сообщение, отображаемое пользователю
     * @return - Возвращение введеной пользователем строки
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
