
public class Money implements Expression {
	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	static Money france(int amount) {
		return new Money(amount, "CHF");
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money)object;
		return money.amount == amount
				&& currency().equals(money.currency());
	}

	String currency(){
		return currency;
	}

	public Money times(int multiplier) {
		return new Money(amount*multiplier, currency);
	}
	
	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}
	
	public Money reduce(String to) {
		return this;
	}
}
