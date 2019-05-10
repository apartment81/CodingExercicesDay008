package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        // testing PaintJob class

        PaintJob paintJob = new PaintJob();
        int result = paintJob.getBucketCount(3.4, 1.5);
        System.out.println(result);

        // Testing SimpleCalculator code

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " +calculator.getAdditionResult());
        System.out.println("subtract= " +calculator.getSubtractionResult());
        System.out.println("multiplication= " +calculator.getMultiplicationResult());
        System.out.println("division= " +calculator.getDivisionResult());


    }
}
