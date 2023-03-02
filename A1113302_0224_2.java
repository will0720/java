import java.util.*;

public class A1113302_0224_2{
	public static void main(String[] argv){
		float celsius,fahrenheit;

		System.out.println("請輸入攝氏溫度(°C):");
		Scanner sc=new Scanner(System.in);
		celsius=sc.nextFloat();
		
		fahrenheit=celsius*9/5+32;

		System.out.println("華氏溫度為"+fahrenheit+"℉");		
	}
}