public interface iCalculator {
    iCalculator sum(ComplexNumber firstNum);
    iCalculator div(ComplexNumber firstNum);
    iCalculator mult(ComplexNumber firstNum);
    ComplexNumber getRes();
}
