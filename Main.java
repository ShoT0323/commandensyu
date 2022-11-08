import java.util.Scanner;
public class Main{
    public static void main(String[]ager){
        Scanner sc = new Scanner(System.in);
	System.out.print("ëÃèd:");
	double weigth = sc.nextDouble();
	System.out.print("êgí∑:");
        double heigth = sc.nextDouble();

        double bmi = weigth /(heigth*heigth);

	System.out.print("Ç†Ç»ÇΩÇÃBMIÇÕ");
        System.out.println((Math.round(bmi * 100)/100.0)+"Ç≈Ç∑");
    }
}
