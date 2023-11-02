package studio7;

public class die {

	private int sides = 0;
	
	public die(int n) {
		sides = n;
	}
	
	public int roll() {
		int result = (int)(Math.random()*this.sides) + 1;
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		die d6 = new die(6);
		System.out.println(d6.roll());
	}

}
