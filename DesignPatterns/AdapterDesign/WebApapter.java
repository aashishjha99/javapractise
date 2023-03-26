package DesignPatterns.AdapterDesign;

public class WebApapter implements WebDriver {

    IEDriver ieDriver;

    public WebApapter(IEDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        // TODO Auto-generated method stub
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        // TODO Auto-generated method stub
        ieDriver.clickElement();
    }



    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.getElement();
        chromeDriver.selectElement();


        IEDriver ieDriver = new IEDriver();
        ieDriver.findElement();
        ieDriver.clickElement();


        WebApapter webApapter = new WebApapter(ieDriver);
        webApapter.getElement();
        webApapter.selectElement();


    }

}
