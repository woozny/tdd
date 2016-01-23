package wordcounter;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class WordCounter {

	private Map<String, Integer> words = new HashMap<>();

	public void addWord(String word) {
		if (words.containsKey(word)) {
			words.put(word, incrementNumberOfOccurrences(word));
		} else {
			words.put(word, 1);
		}

	}

	private int incrementNumberOfOccurrences(String word) {
		return words.get(word) + 1;
	}

	public String getWord(String word) {
		if (words.containsKey(word)) {
			return word;
		}

		throw new NoSuchElementException();

	}

	public int getOccurrences(String word) {
		return words.get(word);
	}
}
