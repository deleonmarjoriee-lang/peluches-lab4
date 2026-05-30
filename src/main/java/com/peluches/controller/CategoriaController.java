package com.peluches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.peluches.models.Categoria;
import com.peluches.service.ICategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService service;

    @GetMapping
    public String listar(Model model) {

        model.addAttribute("categorias", service.listar());

        return "listarCategoria";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {

        model.addAttribute("categoria", new Categoria());

        return "formularioCategoria";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Categoria categoria) {

        service.guardar(categoria);

        return "redirect:/categorias";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        model.addAttribute("categoria",
                service.buscar(id));

        return "formularioCategoria";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        service.eliminar(id);

        return "redirect:/categorias";
    }
}