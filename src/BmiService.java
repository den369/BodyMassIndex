public class BmiService {
    public int calculate(int mass, int tall) {
        int bmi = (mass * 100 * 100) / (tall * tall);
        return bmi;

    }

}
