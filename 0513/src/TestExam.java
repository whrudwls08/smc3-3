import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++){
			if(i%21==0){
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("1~"+a+"���� 3�� ����̸鼭 7�� ����� ���� ���� "+sum+"�Դϴ�.");

	}

}
