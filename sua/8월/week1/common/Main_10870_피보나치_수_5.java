import java.util.Scanner;

public class Main_10870_�Ǻ���ġ_��_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		else return fib(n-1) + fib(n-2);
	}
}
