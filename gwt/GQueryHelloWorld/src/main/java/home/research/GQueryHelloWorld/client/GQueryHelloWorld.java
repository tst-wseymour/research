package home.research.GQueryHelloWorld.client;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import static com.google.gwt.query.client.GQuery.*;


import com.google.gwt.core.client.EntryPoint;

/**
 * Example code for a GwtQuery application
 */
public class GQueryHelloWorld implements EntryPoint {

  public void onModuleLoad() {

    $("div")
    .hover(new Function() {
      public void f(Element e) {
        $(e).css("color", "blue").stop(true, true).animate("fontSize: '+=10px'");
      }
    }, new Function() {
      public void f(Element e) {
        $(e).css("color", "").stop(true, true).animate("fontSize: '-=10px'");
      }
    });
  }

}
