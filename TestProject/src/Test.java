import java.util.ArrayList;

public class Test {
	Object findIndex(Object a, Object[] blist) {
		for(int i=0; i<blist.length; i++)
			if(a.equals(blist[i]))
				return blist[i];
		return null;
	}
	public static void main(String[] args) {
		Test a = new Test();
		Testex b = new Testex();
		TestPara<Integer> c = new TestPara<Integer>();
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		int[] arr = {1,2,3,4,5};
		int num = 2;
		Object[] arr2 = {1,2,3,4,5};
		Object num2 = 5;
		String[] arr3 = {"hi","bye","hello","good","love"};
		String num3 = "bye";
		System.out.println(c.findIndex(num, l));
		// System.out.println(a.findIndex(num, arr)); -> Error
		System.out.println(a.findIndex(num2, arr2));
		
		System.out.println(b.findIndex(num, arr));
		System.out.println(b.findIndex(num2, arr2));
		System.out.println(b.findIndex(num3, arr3));
	}
}
class TestPara<T>{ //Parameter polymorphism
	T findIndex(T a, ArrayList<T> alist) {
		for(int i=0; i<alist.size(); i++)
			if(a.equals(alist.get(i)))
				return alist.get(i);
		return null;
	}
}
class Testex extends Test{
	//Inheritance Polymorphism
	int findIndex(int a, int[] blist) {
		for(int i=0; i<blist.length; i++)
			if(a == blist[i])
				return blist[i];
		return -1;
	}
	String findIndex(String a, String[] slist) {
		for(int i=0; i<slist.length; i++)
			if(a.equals(slist[i]))
				return slist[i];
		return null;
	}
}