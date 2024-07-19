package Service;

import ThirdPartyService.NewUiService;

public class NewUiServiceAdapter implements UiService{
    private final NewUiService newUiService;

    public NewUiServiceAdapter() {
        this.newUiService = new NewUiService();
    }

    @Override
    public void displayMenu(XmlData xmlData) {
        JsonData jsonData=xmlToJsonConvertor(xmlData);
        newUiService.displayJsonMenu(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData=xmlToJsonConvertor(xmlData);
        newUiService.displayJsonRecommendation(jsonData);

    }

    private JsonData xmlToJsonConvertor(XmlData xmlData){
        //Logic to convert Xml data to Json data
        return new JsonData();

    }
}
