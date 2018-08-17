package HtmlParserX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRule {
    private String pageString;

    public RegexRule(String pageString){
        this.pageString = pageString;
    }

    private String title;

    public String getTitle() {
        String regEx = "<title>(?<title>.*?)</title>";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(this.pageString);
        while (matcher.find()){
            return matcher.group("title");
        }
        return "";
    }

    public String getPageString() {
        return pageString;
    }

    public void setPageString(String pageString) {
        this.pageString = pageString;
    }
}
