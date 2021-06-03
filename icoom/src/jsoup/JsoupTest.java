package jsoup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;;

public class JsoupTest {//xml

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String html = "<html><body><p>Hello HTML<a class='test-p'>world</a></p></body></html>";
        Document doc = Jsoup.parse(html);
         
        Elements as= doc.getElementsByClass("test-p");
        for (Element e : as) {
            System.out.println(e.text());
        }
	}

}
