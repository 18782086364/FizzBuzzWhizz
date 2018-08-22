package FizzBuzzWhizz.entity;

public class Word {

  private int fristNum;
  private int secondNum;
  private int thirdNum;
  private String fristString;
  private String secondString;
  private String thirdString;

  public String getFristString() {
    return fristString;
  }

  public String getSecondString() {
    return secondString;
  }

  public String getThirdString() {
    return thirdString;
  }

  public Word(int fistNum, int secondNum, int thirdNum, String fistString,
      String secondString, String thirdString) {
    this.fristNum = fistNum;
    this.secondNum = secondNum;
    this.thirdNum = thirdNum;
    this.fristString = fistString;
    this.secondString = secondString;
    this.thirdString = thirdString;
  }
}
