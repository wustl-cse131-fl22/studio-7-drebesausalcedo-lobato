package studio7;

public class Die {
	private int sides;
	
	public Die(int initsides) {
		sides= initsides;
	}
	
	public int roll()
	{
		int outcome= (int)(Math.random()*(sides))+1;
		return outcome;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die dice= new Die(4);
		System.out.println(dice.roll());
	}

}
