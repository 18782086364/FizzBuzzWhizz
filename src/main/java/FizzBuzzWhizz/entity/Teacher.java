package FizzBuzzWhizz.entity;

public class Teacher {

    private Word word;

    public Word say(int fistNum, int secondNum, int thirdNum, String fistString,
                    String secondString, String thirdString) {
        return new Word(fistNum, secondNum, thirdNum, fistString, secondString, thirdString);
    }

}
