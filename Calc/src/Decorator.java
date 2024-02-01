
public class Decorator implements iCalculator{

    private Calculator complexNumber;
    private Logger loggComplex;
    
    

    public Decorator(Calculator complexNumber, Logger loggComplex) {
        this.complexNumber = complexNumber;
        this.loggComplex = loggComplex;
    }

    @Override
    public iCalculator sum(ComplexNumber firstNum) {
        ComplexNumber firstArg = complexNumber.getRes();

        loggComplex.log(String.format("Первое значение калькулятора: %s + %s * i. Начало вызова метода sum с параметром %s + %s * i", firstArg.getRealNumber(), firstArg.getComplexNumber(), firstNum.getRealNumber(),firstNum.getComplexNumber()));
        iCalculator result = complexNumber.sum(firstNum);
        loggComplex.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public iCalculator div(ComplexNumber firstNum) {
        ComplexNumber firstArg = complexNumber.getRes();

        loggComplex.log(String.format("Первое значение калькулятора: %s + %s * i. Начало вызова метода div с параметром %s + %s * i", firstArg.getRealNumber(), firstArg.getComplexNumber(), firstNum.getRealNumber(),firstNum.getComplexNumber()));
        iCalculator result = complexNumber.div(firstNum);
        loggComplex.log(String.format("Вызов метода div произошел"));
        return result;
    }

    @Override
    public iCalculator mult(ComplexNumber firstNum) {
        ComplexNumber firstArg = complexNumber.getRes();

        loggComplex.log(String.format("Первое значение калькулятора: %s + %s * i. Начало вызова метода mult с параметром %s + %s * i", firstArg.getRealNumber(), firstArg.getComplexNumber(), firstNum.getRealNumber(),firstNum.getComplexNumber()));
        iCalculator result = complexNumber.mult(firstNum);
        loggComplex.log(String.format("Вызов метода mult произошел"));
        return result;
    }


    @Override
    public ComplexNumber getRes() {
        ComplexNumber result = complexNumber.getRes();
        loggComplex.log(String.format("Получение результата %s + %s *i", result.getRealNumber(), result.getComplexNumber()));
        return result;
    }
    
}
