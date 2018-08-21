package FizzBuzzWhizz;

public class Teacher {

  private int fistNum;
  private int secondNum;
  private int thirdNum;
  private String fistString;
  private String secondString;
  private String thirdString;


  public String getFistString() {
    return fistString;
  }

  public String getSecondString() {
    return secondString;
  }

  public String getThirdString() {
    return thirdString;
  }

  public Teacher(int fistNum, int secondNum, int thirdNum, String fistString,
      String secondString, String thirdString) {
    this.fistNum = fistNum;
    this.secondNum = secondNum;
    this.thirdNum = thirdNum;
    this.fistString = fistString;
    this.secondString = secondString;
    this.thirdString = thirdString;
  }

  public String ruleResult(int nums) {
    if (Integer.toString(nums).indexOf(Integer.toString(fistNum)) >= 0) {
      return fistString;
    } else {
      if (nums % fistNum == 0 && nums % secondNum == 0 && nums % thirdNum == 0) {
        return fistString + secondString + thirdString;
      } else if (nums % fistNum == 0 && nums % secondNum == 0) {
        return fistString + secondString;
      } else if (nums % fistNum == 0 && nums % thirdNum == 0) {
        return fistString + thirdString;
      } else if (nums % secondNum == 0 && nums % thirdNum == 0) {
        return secondString + thirdString;
      } else if (nums % fistNum == 0) {
        return fistString;
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
