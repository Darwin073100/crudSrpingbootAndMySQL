package com.sinfloo.demo.controler;

import com.sinfloo.demo.interfaceService.IpersonaService;
import com.sinfloo.demo.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas = service.listar();
        model.addAttribute("personas",personas);
        return "index";
    }
}
