package FizzBuzzWhizz.Rules;

import FizzBuzzWhizz.entity.Word;

public class CommonMultipleRule implements Rule {

    private boolean applicable = false;

    @Override
    public String getResultByPosition(int position, Word word) {
        String result = String.valueOf(position);
        if (position % word.getFristNum() == 0 && position % word.getThirdNum() == 0 && position % word.getSecondNum() == 0) {
            result = word.getFristString() + word.getSecondString() + word.getThirdString();
            applicable = true;
        } else if (position % word.getFristNum() == 0 && position % word.getSecondNum() == 0) {
            result = word.getFristString() + word.getSecondString();
            applicable = true;
        } else if (position % word.getFristNum() == 0 && position % word.getThirdNum() == 0) {
            result = word.getFristString() + word.getThirdString();
            applicable = true;
        } else if (position % word.getSecondNum() == 0 && position % word.getThirdNum() == 0) {
            result = word.getSecondString() + word.getThirdString();
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
