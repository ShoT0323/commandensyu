import java.util.Scanner;
public class Main{
    public static void main(String[]ager){
        Scanner sc = new Scanner(System.in);
	System.out.print("一人目の体重:");
	double weigth1 = sc.nextDouble();
	System.out.print("一人目の身長:");
        double heigth1 = sc.nextDouble();
	System.out.print("二人目の体重:");
	double weigth2 = sc.nextDouble();
	System.out.print("二人目の身長:");
	double heigth2 = sc.nextDouble();

        double bmi1 = weigth1 /(heigth1*heigth1);
	double bmi2 = weigth2 /(heigth2*heigth2);

	System.out.print("一人目のBMIは");
        System.out.println((Math.round(bmi1 * 100)/100.0)+"です");
	System.out.print("二人目のBMIは");
	System.out.println((Math.round(bmi2 * 100)/100.0)+"です");
    }
}
