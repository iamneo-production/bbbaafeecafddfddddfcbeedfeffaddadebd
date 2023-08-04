package com.qa.testscript;

import java.io.IOException;
import org.testng.annotations.Test;
import com.qa.pages.flipPages;

public class flipCount extends testbase {
    @Test
    public void testcase_1() throws IOException {
        flipPages pages = new flipPages(Driver);
        
        int linkCount = pages.getCountOfLinks();
        System.out.println("Number of links on the page: " + linkCount);
        
        pages.printLinkTextAndURLs();
    }
}
