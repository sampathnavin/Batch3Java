package SmartPhone;

public class WorkingPhone {

	public static void main(String[] args) {
		
		SamsungCompany sc = new SamsungCompany();
		
		sc.calling();
		sc.fm();
		sc.sms();
		sc.switchoff();
		sc.switchon();
		sc.ultrazooming();
		
		
		System.out.println("*********************");
		
		IphoneCompany ic = new IphoneCompany();
		ic.facetime();
		ic.applepay();
		ic.calling();
		ic.fm();
		ic.sms();
		ic.switchon();
		ic.switchoff();
		

	}

}
