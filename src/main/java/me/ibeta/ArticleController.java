package me.ibeta;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @RequestMapping("/articles")
    public List<Article> greeting() {
        Article a1 = new Article();
        a1.setId(1);
        a1.setAuthor("author1");
        a1.setTitle("title1");
        a1.setUrl("url1");
        a1.setSummary("summary1");

        Article a2 = new Article();
        a1.setId(2);
        a1.setAuthor("author2");
        a1.setTitle("title2");
        a1.setUrl("url2");
        a1.setSummary("summary2");

        Article a3 = new Article();
        a1.setId(3);
        a1.setAuthor("author3");
        a1.setTitle("title3");
        a1.setUrl("url3");
        a1.setSummary("summary3");

        Article a4 = new Article();
        a1.setId(4);
        a1.setAuthor("author4");
        a1.setTitle("title4");
        a1.setUrl("url4");
        a1.setSummary("summary4");

        List<Article> articles = new ArrayList();

        articles.add(a1);
        articles.add(a2);
        articles.add(a3);
        articles.add(a4);

        return articles;
    }
}
