package day17;

public class HDFC {
	
	public void details()
	{
		EncapsulationRBI rbi = new EncapsulationRBI();
		rbi.setAadharno("64646461678992773");
		rbi.setPanno("AUQWPNAQ109");
		rbi.setAccount("890222020112222922");
		rbi.setLoandetails("From HDFC this account holder is having Personal,Education and Home loan" );
		
		System.out.println(rbi.getAadharno());
		System.out.println(rbi.getPanno());
		System.out.println(rbi.getAccount());
		System.out.println(rbi.getLoandetails());
	}

}
