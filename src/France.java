
public class France {
	private int amount;
	
	public France(int amount) {
		this.amount = amount;
	}
	
	public France times(int multiplier) {
		return new France(amount*multiplier);
	}
	
	public boolean equals(Object object) {
		France france = (France)object;
		return france.amount == amount;
	}
}
