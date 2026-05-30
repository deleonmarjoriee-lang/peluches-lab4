package com.peluches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.peluches.service.IPelucheService;

@Controller
public class PelucheController {

    @Autowired
    private IPelucheService service;

    @GetMapping("/peluches")
    public String listar(Model model) {

        model.addAttribute("peluches",
                service.listar());

        return "listarPeluches";
    }
}