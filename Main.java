import java.util.Scanner;
public class Main{
    public static void main(String[]ager){
        Scanner sc = new Scanner(System.in);
	System.out.print("体重:");
	double weigth = sc.nextDouble();
	System.out.print("身長:");
        double heigth = sc.nextDouble();

        double bmi = weigth /(heigth*heigth);

	System.out.print("あなたのBMIは");
        System.out.println((Math.round(bmi * 100)/100.0)+"です");
    }
}
