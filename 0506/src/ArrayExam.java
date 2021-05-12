import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		int min=0;
		int a=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"번 입력: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++){
			if(arr[i]<arr[i+1]){
				min=arr[i];
				a=i+1;
			}
		}
		System.out.println("가장 큰 수는"+(a+1)+"번쨰 수자인 "+arr[a]);
	}

}
