import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AppTest {

  @Test
  public void App_doesAcceptInput_Array() {
    App app = new App();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    ArrayList<Integer> testReturn = app.doesApp(1);
    assertEquals(expected, testReturn);
  }

  @Test
  public void App_doesAcceptRando_Array() {
    App app = new App();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(3);
    ArrayList<Integer> testReturn = app.doesApp(1);
    assertEquals(expected, testReturn);
  }


}
