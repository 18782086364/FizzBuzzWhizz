package FizzBuzzWhizz.entity;

import FizzBuzzWhizz.Rules.RuleEngine;

public class Student {

  private int position;
  private RuleEngine rules;

  public String say() {
    return rules.getResult(position);
  }
}
