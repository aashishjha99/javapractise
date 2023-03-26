package DesignPatterns.AdapterDesign;

public class ChromeDriver implements WebDriver {

    @Override
    public void getElement() {
        // TODO Auto-generated method stub

        System.out.println("get element from chrome driver");
    }

    @Override
    public void selectElement() {
        // TODO Auto-generated method stub
        System.out.println("select element from chrome driver");
    }

}
