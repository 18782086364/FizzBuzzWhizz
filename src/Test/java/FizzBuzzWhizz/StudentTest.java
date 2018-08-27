package FizzBuzzWhizz;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import FizzBuzzWhizz.Rules.ContainRule;
import FizzBuzzWhizz.Rules.RuleEngine;
import FizzBuzzWhizz.entity.Student;
import FizzBuzzWhizz.entity.Teacher;
import FizzBuzzWhizz.entity.Word;
import org.junit.Test;


public class StudentTest {

  Word words = new Teacher().say(3, 5, 7,"fizz","buzz","whizz");

      @Test
      public void should_3_to_fizz() {

        // given
        RuleEngine ruleEngine = new RuleEngine(words);
        Student student = new Student(3,ruleEngine);

        // when
        String result = student.count();

        // then
        assertThat(student.count()).isEqualTo("fizz");
      }
      @Test
      public void should_10_to_buzz() {
          // given
          RuleEngine ruleEngine = new RuleEngine(words);
          Student student = new Student(10,ruleEngine);

          // when
          String result = student.count();

          // then
          assertThat(student.count()).isEqualTo("buzz");
      }
      @Test
      public void should_49_to_whizz() {
          // given
          RuleEngine ruleEngine = new RuleEngine(words);
          Student student = new Student(49,ruleEngine);

          // when
          String result = student.count();

          // then
          assertThat(student.count()).isEqualTo("whizz");
      }
      @Test
      public void should_30_to_fistString() {
          // given
          RuleEngine ruleEngine = new RuleEngine(words);
          Student student = new Student(30,ruleEngine);

          // when
          String result = student.count();

          // then
          assertThat(student.count()).isEqualTo("fizz");
      }

      @Test
      public void should_15_to_fistString_and_thirdString() {

          // given
          RuleEngine ruleEngine = new RuleEngine(words);
          Student student = new Student(15,ruleEngine);

          // when
          String result = student.count();

          // then
          assertThat(student.count()).isEqualTo("fizzbuzz");
      }

      @Test
      public void should_21_to_fistString_and_thirdString() {
          // given
          RuleEngine ruleEngine = new RuleEngine(words);
          Student student = new Student(21,ruleEngine);

          // when
          String result = student.count();

          // then
          assertThat(student.count()).isEqualTo("fizzwhizz");
      }

      @Test
      public void should_16_to_16() {
          // given
          RuleEngine ruleEngine = new RuleEngine(words);
          Student student = new Student(16,ruleEngine);

          // when
          String result = student.count();

          // then
          assertThat(student.count()).isEqualTo("16");
      }


}
