import java.util.Scanner;
public class Main{
    public static void main(String[]ager){
        Scanner sc = new Scanner(System.in);
	System.out.print("��l�ڂ̑̏d:");
	double weigth1 = sc.nextDouble();
	System.out.print("��l�ڂ̐g��:");
        double heigth1 = sc.nextDouble();
	System.out.print("��l�ڂ̑̏d:");
	double weigth2 = sc.nextDouble();
	System.out.print("��l�ڂ̐g��:");
	double heigth2 = sc.nextDouble();

        double bmi1 = weigth1 /(heigth1*heigth1);
	double bmi2 = weigth2 /(heigth2*heigth2);

	System.out.print("��l�ڂ�BMI��");
        System.out.println((Math.round(bmi1 * 100)/100.0)+"�ł�");
	System.out.print("��l�ڂ�BMI��");
	System.out.println((Math.round(bmi2 * 100)/100.0)+"�ł�");
    }
}
