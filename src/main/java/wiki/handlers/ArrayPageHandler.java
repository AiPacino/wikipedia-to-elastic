/**
 * @author  Alon Eirew
 */

package wiki.handlers;

import wiki.data.WikiParsedPage;

import java.util.ArrayList;
import java.util.List;

public class ArrayPageHandler implements IPageHandler {

    private final List<WikiParsedPage> pages = new ArrayList<>();

    @Override
    public boolean isPageExists(String pageId) {
        if(pages.contains(pageId)) {
            return true;
        }
        return false;
    }

    @Override
    public void addPage(WikiParsedPage page) {
        if(page != null) {
            pages.add(page);
        }
    }

    @Override
    public void flush() {

    }

    @Override
    public void flushRemains() {

    }

    public List<WikiParsedPage> getPages() {
        return this.pages;
    }

    @Override
    public String toString() {
        return "ArrayPageHandler{" +
                "pages=" + pages +
                '}';
    }
}
