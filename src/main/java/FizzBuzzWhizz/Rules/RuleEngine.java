package FizzBuzzWhizz.Rules;

import FizzBuzzWhizz.entity.Word;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
    private final List<Rule> rules = new ArrayList<Rule>();
    private Word word;

    public RuleEngine(Word word) {
        this.word = word;
        rules.add(new ContainRule());
        rules.add(new CommonMultipleRule());
        rules.add(new MultipleRule());
    }

    public String getResult(int position) {
        for (Rule rule : rules) {
            String result = rule.getResultByPosition(position, word);
            if (rule.isApplicable()) {
                rule.clearApplicable();
                return result;
            }
        }
        return String.valueOf(position);
    }
}

