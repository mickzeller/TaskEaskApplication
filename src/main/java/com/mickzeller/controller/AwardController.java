package com.mickzeller.controller;


import com.mickzeller.service.AwardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class AwardController
{

    private AwardService awardService;


    public AwardController(AwardService awardService)
    {
        this.awardService = awardService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAwards(Model model)
    {
        model.addAttribute("awards", awardService.list());
        return "index";
    }


}
