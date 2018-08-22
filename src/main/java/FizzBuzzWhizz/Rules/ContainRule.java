package FizzBuzzWhizz.Rules;

import FizzBuzzWhizz.entity.Word;

public class ContainRule implements Rule {
    private boolean applicable = false;

    @Override
    public String getResultByPosition(int position, Word word) {
        String result = String.valueOf(position);
        if (Integer.toString(position).indexOf(word.getFristString())>=0) {
            result = word.getFristString();
            applicable = true;
        }
        return result;
    }

    @Override
    public Boolean isApplicable() {
        return this.applicable;
    }
}
