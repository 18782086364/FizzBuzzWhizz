package FizzBuzzWhizz.entity;

public class Teacher {

    private Word word;

    public Word say(int fistNum, int secondNum, int thirdNum, String fistString,
                    String secondString, String thirdString) {
        return new Word(fistNum, secondNum, thirdNum, fistString, secondString, thirdString);
    }

//  public String ruleResult(int nums) {
//    if (Integer.toString(nums).indexOf(Integer.toString(fristNum)) >= 0) {
//      return fristString;
//    } else {
//      if (nums % fristNum == 0 && nums % secondNum == 0 && nums % thirdNum == 0) {
//        return fristString + secondString + thirdString;
//      } else if (nums % fristNum == 0 && nums % secondNum == 0) {
//        return fristString + secondString;
//      } else if (nums % fristNum == 0 && nums % thirdNum == 0) {
//        return fristString + thirdString;
//      } else if (nums % secondNum == 0 && nums % thirdNum == 0) {
//        return secondString + thirdString;
//      } else if (nums % fristNum == 0) {
//        return fristString;
//      } else if (nums % secondNum == 0) {
//        return secondString;
//      } else if (nums % thirdNum == 0) {
//        return thirdString;
//      } else {
//        return Integer.toString(nums);
//      }
//    }
//  }
}
