public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        float bmi = service.calculate(1.95F, 95F);
        System.out.println(bmi);
        float bmi2 = service.calculate(1.60F, 60F);
        System.out.println(bmi2);
        float bmi3 = service.calculate(1.95F, 75F);
        System.out.println(bmi3);

    }
}
