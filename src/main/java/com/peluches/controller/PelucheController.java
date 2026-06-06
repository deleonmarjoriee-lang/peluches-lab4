package com.peluches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.peluches.models.Peluche;
import com.peluches.service.ICategoriaService;
import com.peluches.service.IPelucheService;

@Controller
@RequestMapping("/peluches")
public class PelucheController {

    @Autowired
    private IPelucheService service;

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping
    public String listar(Model model) {

        model.addAttribute("peluches", service.listar());

        return "listarPeluches";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {

        model.addAttribute("peluche", new Peluche());
        model.addAttribute("categorias", categoriaService.listar());

        return "formularioPeluche";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Peluche peluche) {

        service.guardar(peluche);

        return "redirect:/peluches";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        model.addAttribute("peluche", service.buscar(id));
        model.addAttribute("categorias", categoriaService.listar());

        return "formularioPeluche";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        service.eliminar(id);

        return "redirect:/peluches";
    }
}