package com.hruiz.ddeskaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SerieController {
    @Autowired
    private SerieRepository serieRepository;

    @GetMapping("/series")
    public String getSeries(Model model) {
        Serie serie = new Serie();
        model.addAttribute("serie", serie);
        model.addAttribute("series", serieRepository.findAll());

        return "series";
    }

    @PostMapping("/series")
    public String addSerie(@ModelAttribute Serie serie) {
        serieRepository.save(serie);
        return "redirect:/series";
    }
}
