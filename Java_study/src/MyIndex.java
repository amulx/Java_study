import HtmlParser.WebPage;
import HtmlParser.WebPageType;
import HtmlParserX.HtmlPage;
import HtmlParserX.JsonPage;
import HtmlParserX.RegexRule;
import com.User;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class MyIndex {
    public static void main(String[] args){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://127.0.0.1/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(doc.title());


//        HtmlPage pages = new HtmlPage("http://127.0.0.1/");
//        System.out.println(pages.getPageString());
//        RegexRule rule = new RegexRule(pages.getPageString());
//        System.out.println(rule.getTitle());
//        JsonPage jpage = new JsonPage("http://127.0.0.1/");



//        WebPageType json = WebPageType.JSON;
//        WebPage webpage = new WebPage("127.0.0.1/",json);
//        System.out.println(webpage.getUrl());


//        System.out.println("this is my java");
//        User user1 = new User();
//        user1.setUsername("张三");
//        user1.check();
//        System.out.println(user1.getUserage());
//        System.out.println(user1.getUsername());
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//        User user2 = new User("王五",(byte) 21);
//        System.out.println(user2.getUsername());
//        System.out.println(user2.getUserage());
    }
}
