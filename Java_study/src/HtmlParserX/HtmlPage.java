package HtmlParserX;

public class HtmlPage extends Page {
    public  HtmlPage(String url){
        setUrl(url);
    }
    public String getPageString(){
        return getPage();
    }
}
