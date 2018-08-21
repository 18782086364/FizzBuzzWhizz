package FizzBuzzWhizz;

public class Student {

  private int num;
  private Teacher rule;

  public Student(int num, Teacher rule) {
    this.num = num;
    this.rule = rule;
  }

  public int getNum() {
    return num;
  }


  public String say() {
    return rule.ruleResult(num);
  }
}
