
package BMIcalcu;
import java.util.Scanner;
public class UpiBMIcalcu {
    public static void main(String[] args) {
        Scanner upi = new Scanner (System.in);
        int beratbdn;
        double tinggibdn;
        double bmi;
        
        System.out.println("Masukkan Berat Badan Anda *kg :");
        beratbdn = upi.nextInt();
        System.out.println("Masukkan Tinggi Badan Anda *cm :");
        tinggibdn = upi.nextDouble();
        tinggibdn/=100;
        bmi= beratbdn/(tinggibdn*tinggibdn);
        System.out.println("Total BMI Anda Adalah "+ bmi);
        
        if(bmi<18.5){
            System.out.println("Anda Kekurangan Berat Badan");
        }
        else if(bmi<24.9){
            System.out.println("Berat Badan Anda Normal");
        }
        else if(bmi<28.9){
            System.out.println("Anda Sedang Kegemukan");
        }
        else {
            System.out.println("Anda Mengalami Obesitas");
        }
    }
}
