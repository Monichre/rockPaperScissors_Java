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
    expected.add(1);
    ArrayList<Integer> testReturn = app.doesApp(1);
    assertEquals(expected, testReturn);
  }

  @Test
  public void App_doesAcceptRando_Array() {
    App app = new App();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(1);
    ArrayList<Integer> testReturn = app.doesApp(1);
    assertEquals(expected, testReturn);
  }

  @Test
  public void App_doesReturnPlayerChoice_String() {
    App app = new App();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(0);
    String expectedPlayer = "paper";
    String testPlayer = app.addRpsPlayer(expected);
    assertEquals(expectedPlayer, testPlayer);
  }

  @Test
  public void App_doesReturnCompChoice_String() {
    App app = new App();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(0);
    String expectedComp = "rock";
    String testComp = app.addRpsComp(expected);
    assertEquals(expectedComp, testComp);
  }

  @Test
  public void App_didWin_String() {
    App app = new App();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(0);
    String win = "player";
    String testComp = app.whoWon(expected);
    assertEquals(win, testComp);
  }

}
