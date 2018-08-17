package HtmlParserX;

public class JsonPage extends Page{
    public JsonPage(String url){
        url = url + "?type=json";
        setUrl(url);
        getPage();
    }
}
