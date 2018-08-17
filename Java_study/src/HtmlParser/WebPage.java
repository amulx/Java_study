package HtmlParser;

import static HtmlParser.WebPageType.JSON;

public class WebPage {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String name;
    private String url;
    public WebPage(String url,WebPageType type){
        url = url.trim();
        url = url.toLowerCase();
        if (!url.contains("http://")){
            url = "http://" + url;
        }
        this.url = url;

        if (type == WebPageType.JSON) {
            url = url + "?type=json";
        }

        WebParser web = new WebParser();

        web.getPage(url);
    }
}
