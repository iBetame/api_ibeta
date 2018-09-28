package me.ibeta.controller;

import me.ibeta.entity.PT;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhouwei on 2018/9/21.
 */
interface PTRepository extends JpaRepository<PT,Integer> {
}