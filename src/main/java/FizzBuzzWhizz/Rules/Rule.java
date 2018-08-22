package FizzBuzzWhizz.Rules;

import FizzBuzzWhizz.entity.Word;

public interface Rule {
    String getResultByPosition(int position, Word word);

    Boolean isApplicable();

    void clearApplicable();
}
