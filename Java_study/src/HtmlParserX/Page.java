package HtmlParserX;

import HtmlParser.WebParser;


public abstract class Page implements IPage{
    String url;

    public String getPage(){
        WebParser pagex = new WebParser();
        return pagex.getPage(this.url);
    }
    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }


}
