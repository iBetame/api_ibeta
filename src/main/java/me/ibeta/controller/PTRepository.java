package me.ibeta.controller;

import me.ibeta.entity.PT;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sunbelife on 2018/9/28.
 */
interface PTRepository extends JpaRepository<PT,Integer> {
}