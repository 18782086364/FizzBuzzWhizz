package FizzBuzzWhizz.entity;

import FizzBuzzWhizz.Rules.RuleEngine;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {

    private int position;
    private RuleEngine rules;

    public String count() {
        return rules.getResult(position);
    }
}
