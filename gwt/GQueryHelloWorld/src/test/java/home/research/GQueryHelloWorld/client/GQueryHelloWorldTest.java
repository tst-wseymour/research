package home.research.GQueryHelloWorld.client;

import static com.google.gwt.query.client.GQuery.*;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.plugins.Effects.Speed;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Timer;
/**
 * Test class for GQueryHelloWorld entry-point
 */
public class GQueryHelloWorldTest extends GWTTestCase {

  public String getModuleName() {
    return "home.research.GQueryHelloWorld.GQueryHelloWorld";
  }

  private double fontSize(GQuery g) {
    return $(g).cur("fontSize", true);
  }

  public void testOnModuleLoad() {

    // Create a container in the document
    final GQuery g =  $("<div></div>").appendTo(document);

    // run onModuleLoad
    GQueryHelloWorld a = new GQueryHelloWorld();
    a.onModuleLoad();

    // delay the test
    delayTestFinish(Speed.DEFAULT * 5);

    // trigger mouse over event
    final double size1 = fontSize(g);
    g.trigger(Event.ONMOUSEOVER);
    new Timer() {
      public void run() {
        // assert that the font size increases
        assertTrue(fontSize(g) > size1);

        // trigger mouse out event
        final double size2 = fontSize(g);
        g.trigger(Event.ONMOUSEOUT);
        new Timer() {
          public void run() {
            // assert that the font size decreases
            assertTrue(fontSize(g) < size2);
            g.remove();

            // finish the test
            finishTest();
          }
        }.schedule(Speed.DEFAULT);
      }
    }.schedule(Speed.DEFAULT);
  }

}
