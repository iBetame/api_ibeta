package me.ibeta.controller;

import me.ibeta.entity.RSS;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sunbelife on 2018/10/4.
 */

interface RSSRepository extends JpaRepository<RSS,Integer> {
}