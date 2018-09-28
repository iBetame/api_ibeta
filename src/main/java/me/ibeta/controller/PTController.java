package me.ibeta.controller;

import java.util.List;

import me.ibeta.entity.PT;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PTController {

    @Resource
    PTRepository ptRepository;

    @RequestMapping("/pt")
    public List<PT> greeting() {
        return ptRepository.findAll();
    }
}
