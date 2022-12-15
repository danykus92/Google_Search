package Tests;

import pages.GoogleSearchPage;

public class TestRun {

    public static void main(String [] args){
        GoogleSearchPage gsp = new GoogleSearchPage();
        gsp.buscar("El Tiempo");

    }
}
