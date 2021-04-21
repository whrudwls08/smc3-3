import java.util.Scanner;

public class Prob_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int count = 0;
		System.out.println("시작 숫자");
		int a=sc.nextInt();
		System.out.println("마지막 숫자");
		int b=sc.nextInt();
		for(i=a;i<=b;i++)
			count=count+i;
		System.out.println(a+"부터 "+b+"까지의 합은"+count);

	}

}
