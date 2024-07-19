import Service.NewUiServiceAdapter;
import Service.OldUiService;
import Service.UiService;
import Service.XmlData;

public class Main {
    public static void main(String[] args) {

        UiService oldUiService=new OldUiService();
        oldUiService.displayMenu(new XmlData());
        oldUiService.displayRecommendations(new XmlData());

        UiService newUiService=new NewUiServiceAdapter();
        newUiService.displayMenu(new XmlData());
        newUiService.displayRecommendations(new XmlData());


    }
}