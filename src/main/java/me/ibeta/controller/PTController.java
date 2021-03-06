package me.ibeta.controller;

import java.util.List;

import me.ibeta.entity.PT;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by sunbelife on 2018/9/28.
 */

@RestController
public class PTController {

    @Resource
    PTRepository ptRepository;

    @RequestMapping("/pt")
    public List<PT> greeting() {
        return ptRepository.findAll();
    }
}
