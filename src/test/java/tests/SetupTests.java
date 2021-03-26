package tests;

import org.junit.Test;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertEquals;


public class SetupTests extends BaseTests{

    @Test
    public void testOpeningBrowserAndingPage(){
        assertEquals(Browser.getCurrentDriver().getCurrentUrl(), Utils.getBaseUrl());
        System.out.println("Abrimos o navegador e carregamos a URL!");
    }
}
