/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home.research.gwthelloworld.client;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.HtmlContainer;
import com.extjs.gxt.ui.client.widget.layout.AccordionLayout;

/**
 *
 * @author WSeymour
 */
public class AccordionContainer {

    public HtmlContainer makeLinks(String[] links) {
        StringBuilder sb = new StringBuilder("<ul class='accordion-list'>");
        for (String link : links) {
            sb.append("<li>").append(link).append("</li>");
        }
        sb.append("</ul>");
        HtmlContainer html = new HtmlContainer(sb.toString());
        return html;
    }

    public ContentPanel getContainer() {
        // create the accordion
        ContentPanel accordionCt = new ContentPanel();
        accordionCt.setSize(400, 300);
        accordionCt.setHeadingHtml("<center>Library Widget</center>");
        accordionCt.setBodyBorder(false);
        accordionCt.setLayout(new AccordionLayout());

        // add the products panel
        ContentPanel panel = new ContentPanel();
        panel.setHeadingHtml("SOPs");
        accordionCt.add(panel);

        // put links into "products"
        String[] links = new String[]{"view", "create", "search"};
        panel.add(makeLinks(links));

        // add the sales panel
        panel = new ContentPanel();
        panel.setHeadingHtml("User Guides");
        accordionCt.add(panel);

        // put links into "sales"
        links = new String[]{"orders", "returns", "invoices"};
        panel.add(makeLinks(links));

        // add the reports panel
        panel = new ContentPanel();
        panel.setHeadingHtml("How Tos");
        accordionCt.add(panel);

        // put links into "reports"
        links = new String[]{"summary", "stock", "Ad-hoc"};
        panel.add(makeLinks(links));

//        // add the issues panel
//        panel = new ContentPanel();
//        // setAnimCollapse(false);
//        panel.setHeadingHtml("Issues");
//        panel.setBodyStyle("padding:10px;");
//        panel.addText("<p>we don't have any <i>issues</i> right ...<p>");
//        accordionCt.add(panel);
        /*
         * GxtCookbk is the application's entry point class. We access its main
         * content panel using the static GxtCookBk.getAppCenterPanel() call. We
         * add our panel to the main content panel.
         */
//        GxtCookBk.getAppCenterPanel().add(accordionCt);
        return accordionCt;
    }

}
