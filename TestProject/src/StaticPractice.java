public class StaticPractice {
	static int m;
	final int f = 5;
	int n;
	final void j() {
		n = 5;
	}
	static void f() {
		m = 5;
	}
	void g() {
		m = 20;
	}
	void h() {
		m = 30;
	}
	public static void main(String[] args) {
		StaticPractice sp1;
		StaticPractice sp2;
		
		StaticPractice.f(); // m = 5
		System.out.println(m);
		sp1 = new StaticPractice();		
		sp1.n = 10;
		sp1.m = 15; // m = 15
		System.out.println(m);
		sp1.g(); // m = 20
		System.out.println(m);
		sp2 = new StaticPractice();
		sp2.n = 30;
		sp2.h(); // m = 30
		sp2.f();
		System.out.println("static m : " +m+ ", sp1.n = " +sp1.n+ ", sp2.n = " +sp2.n);
		
		
		// sp1.f = 6; f cannot be modified
		
	}
}
class finalPractice extends StaticPractice{
	
}
