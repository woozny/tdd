package leap_year_tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class YearTest {


	@Test
	public void notLeapYearIfNotDividableByFour() {
		assertThat(leapYear(1997), is(false));
	}

	@Test
	public void leapYearWhenDividableByFour() {
		assertThat(leapYear(1996), is(true));
	}

	@Test
	public void leapYearWhenDividableByFourHundred() {
		assertThat(leapYear(1600), is(true));
	}

	@Test
	public void notLeapYearIfNotDividableBy100butNotBy400() {
		assertThat(leapYear(1800), is(false));
	}

	private boolean leapYear(int year) {
		return new Year(year).leapYear();
	}

}