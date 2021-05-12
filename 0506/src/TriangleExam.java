
public class TriangleExam {

	public static void main(String[] args) {
		Triangle t = new Triangle(10.2,17.3);
		System.out.println("삼각형 넓이 : "+t.bb()+"cm");
		t.aa(7.5,9.2);
		System.out.println("삼각형 넓이 : "+t.bb()+"cm"
				+ "");
	}
}

class Triangle{
	double g;
	double s;
	public Triangle(double g, double s){
		this.g=g;
		this.s=s;
	}
	public void aa(double g,double s){
		this.g=g;
		this.s=s;
	}
	public double bb(){
		return  g*s*0.5;
	}
}
