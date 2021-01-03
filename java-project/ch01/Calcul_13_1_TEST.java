import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;

public class Calcul_13_1_TEST{
  @Test
  public void test() throws FileNotFoundException {
    try{
      Point p = new Point('p',3.0);
      Assert.assertEquals("p",p.getNom());
      Assert.assertEquals(3.0,p.getValue(),0);
    }
    catch (AssertionError ae){
      success(false);
      msg("Oops! 🐞", ae.getMessage());
      msg("Hint 💡", " 🤔");
    }
  }

  private static void msg(String channel, String msg) {
    System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
  }

  private static void success(boolean success) {
      System.out.println(String.format("TECHIO> success %s", success));
  }
}
