package starter.activity;

import org.openqa.selenium.By;

public class ActivityOverview {

    public static LeftMenu LEFT_MENU;
    public static ActivityTable TABLE;

    public static By ALL_TRAFFIC_CARD = By.xpath("//div[contains(text(),'3.59K')]");
    public static By MALWARE_CARD = By.xpath("//div[contains(text(),'0')]");
    public static By PHISHING_CARD = By.xpath("//div[contains(text(),'10')]");
    public static By C2C_CARD = By.xpath("//div[contains(text(),'0')]");
    public static By NETWORK_SCAN_CARD = By.xpath("//div[contains(text(),'0')]");
    public static By OTHER_CARD = By.xpath("//div[contains(text(),'3')]");

}
