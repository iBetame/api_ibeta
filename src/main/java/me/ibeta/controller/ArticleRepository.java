package me.ibeta.controller;

import me.ibeta.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhouwei on 2018/9/21.
 */
interface ArticleRepository extends JpaRepository<Article,Integer> {
}