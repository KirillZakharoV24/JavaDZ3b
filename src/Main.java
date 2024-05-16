public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.70; //Рост в метрах
        double weight = 77; //Вес в килограммах
        double bmi = service.calculate(weight, height);
        System.out.println(" Индекс массы тела = " + bmi + " кг/м^2");
    }
}