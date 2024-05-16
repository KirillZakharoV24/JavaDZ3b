public class BmiService {
    public double calculate(double weight, double height) {
        double bmi;

        bmi = weight / (height * height);
        return bmi;
    }
}
