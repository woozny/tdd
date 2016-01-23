package leap_year_tdd;

public class Year {
	private int year;

	public Year(int year) {
		this.year = year;
	}

	public boolean leapYear() {
		return inDividableBy(4) && !(inDividableBy(100) && isNotDividableBy(400));
	}

	private boolean isNotDividableBy(int number) {
		return year % number != 0;
	}

	private boolean inDividableBy(int number) {
		return year % number == 0;
	}
}
