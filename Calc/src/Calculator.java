

public class Calculator implements iCalculator{

    // primaryComplex - Экземпляр класса ComplexNumber, описывающий первый  аргумент. 
    private ComplexNumber primaryComplex;

    public Calculator(ComplexNumber primaryComplex) {
        this.primaryComplex = primaryComplex;
    }

    
    
    /** 
     * @param firstNum - Экземпляр класса Complex Number, представляющий собой объект с двумя свойствами: действителная часть числа и мнимая часть числа.
     * Метод описывает операцию попарного сложения действительных и мнимых частей двух аргументов: первого - primary и второгр - firstNum.
     */

    @Override
    public iCalculator sum(ComplexNumber firstNum) {
        primaryComplex.setRealNumber(primaryComplex.getRealNumber() + firstNum.getRealNumber());
        primaryComplex.setComplexNumber(primaryComplex.getComplexNumber() + firstNum.getComplexNumber());
        return this;
    }

    /** 
     * Метод описывает разность действительных и мнимых частей двух аргументов, соотвественно, первого - primary и второгр - firstNum.
     */
    @Override
    public iCalculator div(ComplexNumber firstNum) {
        primaryComplex.setRealNumber(primaryComplex.getRealNumber() - firstNum.getRealNumber());
        primaryComplex.setComplexNumber(primaryComplex.getComplexNumber() - firstNum.getComplexNumber());
        return this;
    }

    
    /** 
     * Метод описывает операцию умножения действительных и мнимых частей двух аргументов, соотвественно, первого - primary и второгр - firstNum.
     */
    @Override
    public iCalculator mult(ComplexNumber firstNum) {
        double a = primaryComplex.getRealNumber();
        double b = primaryComplex.getComplexNumber();
        double c = firstNum.getRealNumber();
        double d = firstNum.getComplexNumber();
        primaryComplex.setRealNumber((a * c) - (b * d));
        primaryComplex.setComplexNumber((b * c) + (a * d));
        return this;
    }

    /**
     * @return ComplexNumber - возвращаем объект класса ComplexNumber.
     */
    @Override
    public ComplexNumber getRes() {
        return primaryComplex;
    }
    
    
}
