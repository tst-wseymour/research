package research.gwtmvnspike.client;

import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Dialog;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define
 * <code>onModuleLoad()</code>.
 */
public class Module1 implements EntryPoint {

    private static LayoutContainer appCenter = new LayoutContainer();

    public static LayoutContainer getAppCenterPanel() {
        return appCenter;
    }

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
//        // dialog window
//        Dialog dialog = new Dialog();
//        dialog.setBodyBorder(false);
//        dialog.setClosable(false);
//        dialog.setHideOnButtonClick(true);
//        dialog.setButtons(Dialog.OKCANCEL);
//        dialog.setScrollMode(Scroll.NONE);
//        dialog.setHeadingHtml("GXT Cookbook :: Recipe Three");
//        dialog.addText("Dialogs are descendants of the Window class, so they are windows that can do even more.");
//        dialog.show();
//        SelectionListener<ButtonEvent> listener = new SelectionListener<ButtonEvent>() {
//
//            @Override
//            public void componentSelected(ButtonEvent evt) {
//                String text = evt.getButton().getHtml();
//                String format = "You clicked the {0} button";
//                Info.display("Recipe Three", format, text);
//            }
//        };
//
//        Button okBtn = dialog.getButtonById(Dialog.OK);
//        okBtn.addSelectionListener(listener);
//        Button cancelBtn = dialog.getButtonById(Dialog.OK);
//        cancelBtn.addSelectionListener(listener);
//
//
//
//        // basic window setup
//        Window xWindow = new Window();
//        xWindow.setHeadingHtml("GXT CookBook | Recipe One");
//        xWindow.setClosable(true);
//        xWindow.setSize(350, 170);
//        xWindow.setModal(true);
//        xWindow.setBlinkModal(true);
//        xWindow.setResizable(true);
//        xWindow.setMaximizable(true);
//
//
//        // prepare content to show
//        LayoutContainer textPanel = new VerticalPanel();
//        textPanel.setStyleAttribute("padding", "15px");
//        textPanel.addText("This is our first recipe from GXT Cookbok, how are we doing so far ...");
//
//        // some content
//        StringBuilder msg = new StringBuilder();
//        msg.append("This window can do lots of stuff.");
//
//        // constrain maximize surface to container, not browser's complete viewable area
//        xWindow.setContainer(textPanel.getElement());
//        // constrain draggable to the same as above
//        xWindow.getDraggable().setContainer(textPanel);


        // 
        AccordionContainer accordionContainer = new AccordionContainer();
        RootPanel.get().add(accordionContainer.getContainer());



        // place content on the window
        // and display it.
//        xWindow.add(textPanel);
//        xWindow.show();
    }
}
