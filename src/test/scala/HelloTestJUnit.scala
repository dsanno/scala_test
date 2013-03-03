import junit.framework.TestCase
import junit.framework.Assert.assertEquals
import org.junit.Test;

class HelloTest extends TestCase {
  var hello = new default.Hello("Mike")

  @Test
  def testNameShouldReturnName() {
    assertEquals("Mike", hello.name);
  }

  @Test
  def testGetShouldReturnHelloString() {
    assertEquals("Hello Mike!", hello.get);
  }
}
