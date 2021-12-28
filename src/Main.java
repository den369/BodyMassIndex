public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(80, 180);
        // mass - вес в килограммах tall - рост в сантиметрах
        System.out.println("Индекс массы тела " + bmi);
    }
}
