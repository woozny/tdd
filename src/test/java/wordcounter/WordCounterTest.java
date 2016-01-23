package wordcounter;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class WordCounterTest {

	public static final String WORD1 = "My Word";
	public static final String WORD2 = "My second Word";
	public static final String NOT_EXISTING_WORD = "Not existing word";

	private WordCounter wordCounter = new WordCounter();

	@Test
	public void shouldBeAbleToAddWord() {
		addSingleWord();

		assertEquals(wordCounter.getWord(WORD1), WORD1);
	}

	@Test public void shouldBeAbleToAddMoreThanOneWord() {
		addTwoWords();

		assertEquals(wordCounter.getWord(WORD1), WORD1);
		assertEquals(wordCounter.getWord(WORD2), WORD2);

	}

	@Test
	public void shouldBeAbleToGetSingleWordIfExists() {
		addTwoWords();

		assertEquals(wordCounter.getWord(WORD1), WORD1);
	}

	@Test(expected = NoSuchElementException.class)
	public void shouldThrowExceptionWhenWordDoesNotExists() {
		addTwoWords();

		wordCounter.getWord(NOT_EXISTING_WORD);

	}

	private void addSingleWord() {
		wordCounter.addWord(WORD1);
	}

	private void addTwoWords() {
		wordCounter.addWord(WORD1);
		wordCounter.addWord(WORD2);
	}

}