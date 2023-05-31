package day17;

public class ICICI {
	
	public void details()
	{
		EncapsulationRBI rbi = new EncapsulationRBI();
		rbi.setAadharno("64646461678992773");
		rbi.setPanno("AUQWPNAQ109");
		rbi.setAccount("102020202023933");
		rbi.setLoandetails("From ICICI this account holder is having Personal and Home loan" );
		
		System.out.println(rbi.getAadharno());
		System.out.println(rbi.getPanno());
		System.out.println(rbi.getAccount());
		System.out.println(rbi.getLoandetails());
	}

}
