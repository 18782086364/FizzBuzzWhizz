package FizzBuzzWhizz;

public class Teacher {

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

  public Teacher(int fistNum, int secondNum, int thirdNum, String fistString,
      String secondString, String thirdString) {
    this.fristNum = fistNum;
    this.secondNum = secondNum;
    this.thirdNum = thirdNum;
    this.fristString = fistString;
    this.secondString = secondString;
    this.thirdString = thirdString;
  }

  public String ruleResult(int nums) {
    if (Integer.toString(nums).indexOf(Integer.toString(fristNum)) >= 0) {
      return fristString;
    } else {
      if (nums % fristNum == 0 && nums % secondNum == 0 && nums % thirdNum == 0) {
        return fristString + secondString + thirdString;
      } else if (nums % fristNum == 0 && nums % secondNum == 0) {
        return fristString + secondString;
      } else if (nums % fristNum == 0 && nums % thirdNum == 0) {
        return fristString + thirdString;
      } else if (nums % secondNum == 0 && nums % thirdNum == 0) {
        return secondString + thirdString;
      } else if (nums % fristNum == 0) {
        return fristString;
      } else if (nums % secondNum == 0) {
        return secondString;
      } else if (nums % thirdNum == 0) {
        return thirdString;
      } else {
        return Integer.toString(nums);
      }
    }
  }
}
