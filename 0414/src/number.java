import java.util.Scanner;


public class number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지):");
		int a=sc.nextInt(); 
		int b[] = new int[10] ;
		for(int i = 0; i<10;i++){
			b[i]=(int)(Math.random()*50+1);
			System.out.print(b[i]+" ");
		}
		for(int i = 0; i<10; i++){
			if(b[i]==a)
				System.out.println("당첨");
		else{
			System.out.println("꽝");
			break;
		}
	}
		
	}
}
