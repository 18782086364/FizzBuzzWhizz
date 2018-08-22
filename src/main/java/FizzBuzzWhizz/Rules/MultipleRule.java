package FizzBuzzWhizz.Rules;

import FizzBuzzWhizz.entity.Word;

public class MultipleRule implements Rule {
    private boolean applicable = false;

    @Override
    public String getResultByPosition(int position, Word word) {
        String result = String.valueOf(position);
        if (position % word.getFristNum() == 0) {
            result = word.getFristString();
            applicable = true;
        } else if (position % word.getSecondNum() == 0) {
            result = word.getSecondString();
            applicable = true;
        } else if (position % word.getThirdNum() == 0) {
            result = word.getThirdString();
            applicable = true;
        }
        return result;
    }

    @Override
    public Boolean isApplicable() {
        return this.applicable;
    }

    @Override
    public void clearApplicable() {
        applicable = false;
    }
}
