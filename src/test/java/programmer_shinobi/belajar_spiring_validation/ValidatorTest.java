package programmer_shinobi.belajar_spiring_validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import programmer_shinobi.belajar_spiring_validation.data.Person;

import java.util.Set;

@SpringBootTest
public class ValidatorTest {

    @Autowired
    private Validator validator;

    @Test
    void personNotValid() {
        Person person = new Person("1", "Faqih");

        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        Assertions.assertTrue(constraintViolations.isEmpty());

    }

}
