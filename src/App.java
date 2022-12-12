import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double avr =0 ;
        Scanner input = new Scanner (System.in);
        System.out.println("please insert num of values4");
        int N =input.nextInt();
        for (int i=0; i<N;i++){
             double tmp =input.nextDouble();
             avr =avr +(tmp/N);
             
        }
        System.out.println(avr);
    }
}
