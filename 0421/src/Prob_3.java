import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade g = new Grade();	
		System.out.println("����, ����, ���� ������ 3���� ���� �Է� >>");
		g.math=sc.nextInt();
		g.science=sc.nextInt();
		g.english=sc.nextInt();
		System.out.println("����� " + g.average()+"�Դϴ�");
		
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
		
	}
}