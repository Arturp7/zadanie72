public class Number03Main {
    public static void main(String[] args) {
        double value = 0;
        double step = 0.1;

        while (value <= 3.1){
            System.out.printf("%.1f\n",value);
            value += step;}


        do {
            System.out.printf("%.1f\n",value);
            value += step;
        } while (value <=3.1);


    }
}
