package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {
    @Autowired
    private CarService carServiceImpl;
    @GetMapping(value = "/cars")
    public String carController(@RequestParam(required = false) Integer count, ModelMap model) {
        model.addAttribute(carServiceImpl.getCarsList(count));
        return "cars";
    }
}

//
