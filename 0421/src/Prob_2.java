import java.util.Scanner;

public class Prob_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1000 ������ �ڿ����� �Է��ϼ���.");
		int num1 = scan.nextInt();
		int sum=0;
		int i=0;
		
		for(i=1;i<=num1;i++){
			if(i%4==0) {
				sum=sum+i;
				System.out.println(i);
			}	
		}
		System.out.println("1~"+num1+"���� 4�� ����� ���� "+sum+"�Դϴ�.");

	}

}
