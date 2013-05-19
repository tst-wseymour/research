package research.gwtmvnspike.client;

import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.Window;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define
 * <code>onModuleLoad()</code>.
 */
public class Module1 implements EntryPoint {



    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        // basic window setup
        Window basicWindow = new Window();
        basicWindow.setHeadingHtml("GXT CookBook | Recipe One");
        basicWindow.setClosable(true);
        basicWindow.setSize(350, 170);

        // prepare content to show
        LayoutContainer textPanel = new VerticalPanel();
        textPanel.setStyleAttribute("padding", "15px");
        textPanel.addText("This is our first recipe from GXT Cookbok, how are we doing so far ...");

        // place content on the window
        // and display it.
        basicWindow.add(textPanel);
        basicWindow.show();
    }
}
