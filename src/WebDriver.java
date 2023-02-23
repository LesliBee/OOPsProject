public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakeScreenShot extends  RemoteWebDriver{
    void getScreenShot();
}

class ChromeDriver implements RemoteWebDriver, WebDriver {
    public void navigate() {
        System.out.println("Download Chrome Driver");
    }

    public void open() {
        System.out.println("Opening Chrome Driver");
    }

    public void close() {
        System.out.println("Close The Chrome Driver");
    }

    public String getTitle() {
        return "Chrome Driver";

    }
}
class FireFoxDriver implements RemoteWebDriver, WebDriver {
    public void navigate() {
        System.out.println("Download FireFox Driver");
    }

    public void open() {
        System.out.println("Opening FireFox Driver");
    }

    public void close() {
        System.out.println("Close The FireFox Driver");
    }

    public String getTitle() {
        return "FireFox Driver";

    }
}

class SafariDriver implements RemoteWebDriver, WebDriver {
    public void navigate() {
        System.out.println("Download Safari Driver");
    }

    public void open() {
        System.out.println("Opening Safari Driver");
    }

    public void close() {
        System.out.println("Close The Safari Driver");
    }

    public String getTitle() {
        return "Safari Driver";

    }
}
