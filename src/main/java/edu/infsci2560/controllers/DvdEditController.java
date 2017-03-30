/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Dvd;
import edu.infsci2560.repositories.DvdRepository;
import edu.infsci2560.repositories.RatingRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author kolobj
 */
@Controller
public class DvdEditController {
    @Autowired
    private DvdRepository dvdRepository;
    
    @Autowired
    private RatingRepository ratingRepository; 
    
    @RequestMapping(value = "dvds/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {                 
        ModelAndView mv = new ModelAndView("dvdEdit");
        Dvd dvd = dvdRepository.findOne(id);
        mv.addObject("dvd", dvd);
//        mv.addObject("ratings", ratingRepository.findAll());
        mv.addObject("ratings", ratingRepository.findByRatingPkDvdId(dvd.getId(), new PageRequest(0, 10)));
        return mv;
    }
    
    @RequestMapping(value = "dvds/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid Dvd dvd, BindingResult result) {
        dvdRepository.save(dvd);
        return "redirect:/dvds";
    }        
}
