import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Calendar;
import org.example.Person;
import org.junit.Test;

public class ApplicationTest {

  @Test
  public void testGetAge() {
    Person person = new Person("Zamir", LocalDate.of(1992, Calendar.OCTOBER, 15));

    assertEquals(31, person.getAge(LocalDate.now()));
  }
}
