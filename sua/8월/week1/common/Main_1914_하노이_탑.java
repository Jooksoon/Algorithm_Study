import java.util.Scanner;
//�̿ϼ�... ��
public class Main_1914_�ϳ���_ž {
	static int cnt = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		hanoi(1, 2, 3, n);
	}
	
	public static void hanoi(int start, int mid, int end, int n) {
		if(n==1) System.out.println(cnt);
		else {
		hanoi(start, end, mid, n-1);
		System.out.println(start + " " + mid);		
		hanoi(mid, start, end, n-1);
		
		}
	}

}
