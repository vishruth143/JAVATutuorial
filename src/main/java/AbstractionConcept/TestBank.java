package AbstractionConcept;

public class TestBank {
	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank b = new HDFCBank();
		b.loan();
		b.credit();
		b.debit();	
	}
}
