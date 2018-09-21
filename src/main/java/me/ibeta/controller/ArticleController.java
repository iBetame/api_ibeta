package me.ibeta.controller;

import java.util.List;

import me.ibeta.entity.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ArticleController {

    @Resource
    ArticleRepository articleRepository;

    @RequestMapping("/articles")
    public List<Article> greeting() {
        return articleRepository.findAll();
    }
}
