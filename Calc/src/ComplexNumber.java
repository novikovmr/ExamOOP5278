

public class ComplexNumber {

    /**
     * @param realNumber - действительная часть комплексного числа
     * @param imagineNumber - мнимая часть комплексного числа
     */
    private double realNumber;
    private double imagineNumber;

    public ComplexNumber(double realNumber, double imagineNumber) {
        this.realNumber = realNumber;
        this.imagineNumber = imagineNumber;
    }

    //Геттеры и сеттеры
    public double getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public double getComplexNumber() {
        return imagineNumber;
    }

    public void setComplexNumber(double imagineNumber) {
        this.imagineNumber = imagineNumber;
    }


}
