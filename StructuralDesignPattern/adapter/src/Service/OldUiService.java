package Service;

public class OldUiService implements UiService{

    @Override
    public void displayMenu(XmlData xmlData) {
        System.out.println("Showing xml menu data");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("showing xml recommendation data");
    }
}
