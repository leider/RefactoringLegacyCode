package pushpull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import common.Transaction_API;

public class Transactions {

	private final List<Transaction_API> transactions;

	public Transactions(List<Transaction_API> transactions) {
		this.transactions = transactions;
	}

	List<Transaction_API> transactionsOfMonth(LocalDate date) {
		List<Transaction_API> results = new ArrayList<Transaction_API>();
		for (Transaction_API transaction : transactions) {
			LocalDate dateOfTransaction = transaction.getDate();
			if (areSameMonthAndYear(date, dateOfTransaction)) {
				results.add(transaction);
			}
		}
		return results;
	}

	private boolean areSameMonthAndYear(LocalDate date, LocalDate dateOfTransaction) {
		return dateOfTransaction.getMonthValue() == date.getMonthValue() && dateOfTransaction.getYear() == date.getYear();
	}

}
