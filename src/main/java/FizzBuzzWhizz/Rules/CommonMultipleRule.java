package FizzBuzzWhizz.Rules;

import FizzBuzzWhizz.entity.Word;

public class CommonMultipleRule implements Rule {

    private boolean applicable = false;

    @Override
    public String getResultByPosition(int position, Word word) {
        StringBuffer result = new StringBuffer();
        if (position % word.getFristNum() == 0 && position % word.getThirdNum() == 0 && position % word.getSecondNum() == 0) {
            result.append(word.getFristNum()).append(word.getSecondNum()).append(word.getThirdString());
            applicable = true;
        } else if (position % word.getFristNum() == 0 && position % word.getSecondNum() == 0) {
            result.append(word.getFristNum()).append(word.getSecondNum());
            applicable = true;
        } else if (position % word.getFristNum() == 0 && position % word.getThirdNum() == 0) {
            result.append(word.getFristNum()).append(word.getThirdString());
            applicable = true;
        } else if (position % word.getSecondNum() == 0 && position % word.getThirdNum() == 0) {
            result.append(word.getSecondString()).append(word.getThirdString());
            applicable = true;
        }
        return result.toString();
    }

    @Override
    public Boolean isApplicable() {
        return this.applicable;
    }
}
