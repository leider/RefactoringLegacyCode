package common;

import java.time.LocalDate;

public class Transaction_API {

	private final LocalDate date;
	private final int amount;

	public Transaction_API(LocalDate date, int amount) {
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public int getAmount() {
		return amount;
	}

}
