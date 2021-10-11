package starter.activity;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class OverviewData {

    public static Question<String> numberOfContacts(String activityType) {
        switch (activityType) {
            case "All Traffic":
                return actor -> TextContent.of(ActivityOverview.ALL_TRAFFIC_CARD).viewedBy(actor).asString();
            case "Malware":
                return actor -> TextContent.of(ActivityOverview.MALWARE_CARD).viewedBy(actor).asString();
            case "Phishing":
                return actor -> TextContent.of(ActivityOverview.PHISHING_CARD).viewedBy(actor).asString();
            case "C&C":
                return actor -> TextContent.of(ActivityOverview.C2C_CARD).viewedBy(actor).asString();
            case "Network Scan":
                return actor -> TextContent.of(ActivityOverview.NETWORK_SCAN_CARD).viewedBy(actor).asString();
            case "Other":
                return actor -> TextContent.of(ActivityOverview.OTHER_CARD).viewedBy(actor).asString();
            default:
                return null;

        }


    }

}
