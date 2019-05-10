package ro.mirodone;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;



    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }


    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {

        return (this.firstNumber + secondNumber);
    }

    public double getSubtractionResult() {

        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {

        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {

        if (secondNumber == 0) {
            return 0;
        }
        return (firstNumber / secondNumber);
    }
}