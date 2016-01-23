package wordcounter;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class WordCounter {

	private ArrayList<String> words = new ArrayList<>();

	public void addWord(String word) {
		words.add(word);

	}

	public String getWord(String word) {
		if (words.contains(word)) {
			return words.get(words.indexOf(word));
		}

		throw new NoSuchElementException();

	}
}
