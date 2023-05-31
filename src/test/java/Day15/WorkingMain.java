package Day15;

public class WorkingMain extends PolymorphismPart2 {
	
	
	public void add()
	{
		int a = 10 ;
		int b = 15 ;
		int c = 50 ;
		int d = a + b+c ;
		System.out.println(d);
	}

	public void sub()
	{
		int a = 15 ;
		int b = 10 ;
		int c =5  ;
		int d = a-b-c ;
		System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Before Overrding");
		PolymorphismPart2 pm = new PolymorphismPart2();
		System.out.println(pm.x);
		pm.add();
		pm.sub();
		
		System.out.println("After Overrding");
		WorkingMain wm = new WorkingMain();
		pm.x = 20;
		System.out.println(pm.x);
		wm.add();
		wm.sub();
		
		
		

	}

}
