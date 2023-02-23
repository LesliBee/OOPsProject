public class WebDriverTester {
    public static void main(String[] args) {


        ChromeDriver chromeDriver= new ChromeDriver();
        chromeDriver.navigate();
        chromeDriver.open();
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();


        FireFoxDriver fireFox= new FireFoxDriver();
        fireFox.navigate();
        fireFox.open();
        System.out.println(fireFox.getTitle());
        fireFox.close();


        SafariDriver safari= new SafariDriver();
        safari.navigate();
        safari.open();
        System.out.println(safari.getTitle());
        safari.close();
    }}

