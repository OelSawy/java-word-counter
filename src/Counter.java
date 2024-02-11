import java.util.ArrayList;
import java.util.Arrays;

public class Counter {
   public static int wordCount = 0; // variable to store the word count
   
   public void countWords(String paragraph) {
      ArrayList<String> words = new ArrayList<String>(Arrays.asList(paragraph.split(" "))); // split the sentence into words
      String[] temp = {".", ",", "!", "?", ";", ":", "-", "_", "(", ")", "[", "]", "{", "}", "<", ">", "/", "\\", "|", "`", "~", "@", "#", "$", "%", "^", "&", "*", "+", "="};
      ArrayList<String> punc = new ArrayList<String>(Arrays.asList(temp));
      words.removeAll(punc);
      wordCount = words.size(); // add the number of words to the word count
   }

   public int getWordCount() {
      return wordCount; //! return the word count
   }

   public void clearWords() {
      wordCount = 0; //! clear the word count
   }
}
