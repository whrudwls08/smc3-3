import java.util.Scanner;


public class number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10���� ���� ���� �� �ϳ��� ���纸����(1~50����):");
		int a=sc.nextInt(); 
		int b[] = new int[10] ;
		for(int i = 0; i<10;i++){
			b[i]=(int)(Math.random()*50+1);
			System.out.print(b[i]+" ");
		}
		for(int i = 0; i<10; i++){
			if(b[i]==a)
				System.out.println("��÷");
		else{
			System.out.println("��");
			break;
		}
	}
		
	}
}
