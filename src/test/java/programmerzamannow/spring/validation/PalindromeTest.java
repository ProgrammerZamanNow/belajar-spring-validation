package programmerzamannow.spring.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import programmerzamannow.spring.validation.data.Foo;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootTest
public class PalindromeTest {

  @Autowired
  private Validator validator;

  @Test
  void palindromeValid() {
    Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("kodok"));
    Assertions.assertTrue(constraintViolations.isEmpty());
  }

  @Test
  void palindromeInvalid() {
    Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("eko"));
    Assertions.assertFalse(constraintViolations.isEmpty());
    Assertions.assertEquals(1, constraintViolations.size());
  }

  @Test
  void palindromeInvalidMessage() {
    Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("eko"));
    Assertions.assertFalse(constraintViolations.isEmpty());
    Assertions.assertEquals(1, constraintViolations.size());

    String message = constraintViolations.stream().findFirst().get().getMessage();
    Assertions.assertEquals("Data bukan palindrome", message);
  }
}
