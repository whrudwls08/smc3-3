import java.util.Scanner;

public class Prob_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int count = 0;
		System.out.println("���� ����");
		int a=sc.nextInt();
		System.out.println("������ ����");
		int b=sc.nextInt();
		for(i=a;i<=b;i++)
			count=count+i;
		System.out.println(a+"���� "+b+"������ ����"+count);

	}

}
