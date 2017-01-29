/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.repositories.DvdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class DvdsController {
    @Autowired
    private DvdRepository repository;
    
    @RequestMapping(value = "dvds", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("dvds", "dvds", repository.findAll());
    }
    
}
