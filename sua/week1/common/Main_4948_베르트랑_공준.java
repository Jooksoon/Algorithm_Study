import java.util.Scanner;

public class Main_4948_����Ʈ��_���� {
    //n���� ũ�� 2n���� �۰ų� ���� �Ҽ� ���� ���ϱ�
    static boolean[] prime = new boolean[246913];

public static void main(String[] args) {
    // TODO Auto-generated method stub

            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            int n = 1;                                
            int result = 0;
            get_prime();
            
            while(n != 0) {
                n = sc.nextInt();
                result = 0;
                
                
                for(int i = n; i <= 2*n; i++) {
                    if(prime[i] == false) result++;
                }
                
                System.out.println(result);
                
            }
            
            
            

        }

    public static void get_prime() {
            prime[0] = prime[1] = true;
        
            for(int i = 2; i <= Math.sqrt(prime.length); i++) {
                if(prime[i]) continue;
                for(int j = i * i; j < prime.length; j += i) {
                    prime[j] = true;
            }
        }
    }
}
