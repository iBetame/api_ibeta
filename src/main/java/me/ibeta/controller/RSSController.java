package me.ibeta.controller;

import java.util.List;

import me.ibeta.entity.PT;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Sunbelife on 2018/10/4.
 */

@RestController
public class RSSController {

    @Resource
    RSSRepository rssRepository;

    @RequestMapping("/rss")
    public List<RSS> greeting() {
        return rssRepository.findAll();
    }
}
